# VERSION = $Id$ $Rev: 241533 $ $Date: 2014-10-16 17:00:00 +0530 (Thu, 16 Oct 2014) $

!define APP_NAME "Gain"
!define COMP_NAME "Innovative Interface"
!define WEB_SITE "http://www.iii.com"
!define VERSION "02.00.01.00"
!define COPYRIGHT "Author  © 2006"
!define DESCRIPTION "Application"
!define INSTALLER_NAME ".\target\GainSetup.exe"
!define MAIN_APP_EXE "Gain.exe"
!define INSTALL_TYPE "SetShellVarContext current"
!define REG_ROOT "HKCU"
!define REG_APP_PATH "Software\Microsoft\Windows\CurrentVersion\App Paths\${MAIN_APP_EXE}"
!define UNINSTALL_PATH "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APP_NAME}"

!define REG_START_MENU "Start Menu Folder"

var SM_Folder

######################################################################

VIProductVersion  "${VERSION}"
VIAddVersionKey "ProductName"  "${APP_NAME}"
VIAddVersionKey "CompanyName"  "${COMP_NAME}"
VIAddVersionKey "LegalCopyright"  "${COPYRIGHT}"
VIAddVersionKey "FileDescription"  "${DESCRIPTION}"
VIAddVersionKey "FileVersion"  "${VERSION}"

######################################################################

SetCompressor ZLIB
Name "${APP_NAME}"
Caption "${APP_NAME}"
OutFile "${INSTALLER_NAME}"
BrandingText "${APP_NAME}"
XPStyle on
InstallDirRegKey "${REG_ROOT}" "${REG_APP_PATH}" ""
InstallDir "$DESKTOP\Gain"

######################################################################

!include "MUI.nsh"

!define MUI_ABORTWARNING
!define MUI_UNABORTWARNING

!insertmacro MUI_PAGE_WELCOME

!ifdef LICENSE_TXT
!insertmacro MUI_PAGE_LICENSE "${LICENSE_TXT}"
!endif

!insertmacro MUI_PAGE_DIRECTORY

!ifdef REG_START_MENU
!define MUI_STARTMENUPAGE_NODISABLE
!define MUI_STARTMENUPAGE_DEFAULTFOLDER "Gain"
!define MUI_STARTMENUPAGE_REGISTRY_ROOT "${REG_ROOT}"
!define MUI_STARTMENUPAGE_REGISTRY_KEY "${UNINSTALL_PATH}"
!define MUI_STARTMENUPAGE_REGISTRY_VALUENAME "${REG_START_MENU}"
!insertmacro MUI_PAGE_STARTMENU Application $SM_Folder
!endif

!insertmacro MUI_PAGE_INSTFILES

!insertmacro MUI_PAGE_FINISH

!insertmacro MUI_UNPAGE_CONFIRM

!insertmacro MUI_UNPAGE_INSTFILES

!insertmacro MUI_UNPAGE_FINISH

!insertmacro MUI_LANGUAGE "English"

######################################################################

Section -MainProgram
${INSTALL_TYPE}
SetOverwrite ifnewer
SetOutPath "$INSTDIR"

File ".\target\Gain.exe"

SetOutPath "$INSTDIR\Support"
File ".\target\Support\*"
SetOutPath "$INSTDIR\Support\Images"
File ".\target\Support\Images\*"

SetOutPath "$INSTDIR\Support\dependency-jars"
File ".\target\Support\dependency-jars\*"


SectionEnd

######################################################################

Section -Icons_Reg
SetOutPath "$INSTDIR"
WriteUninstaller "$INSTDIR\uninstall.exe"

!ifdef REG_START_MENU
!insertmacro MUI_STARTMENU_WRITE_BEGIN Application
CreateDirectory "$SMPROGRAMS\$SM_Folder"
CreateShortCut "$SMPROGRAMS\$SM_Folder\${APP_NAME}.lnk" "$INSTDIR\${MAIN_APP_EXE}"
!ifdef WEB_SITE
WriteIniStr "$INSTDIR\${APP_NAME} website.url" "InternetShortcut" "URL" "${WEB_SITE}"
CreateShortCut "$SMPROGRAMS\$SM_Folder\${APP_NAME} Website.lnk" "$INSTDIR\${APP_NAME} website.url"
!endif
!insertmacro MUI_STARTMENU_WRITE_END
!endif

!ifndef REG_START_MENU
CreateDirectory "$SMPROGRAMS\Gain"
CreateShortCut "$SMPROGRAMS\Gain\${APP_NAME}.lnk" "$INSTDIR\${MAIN_APP_EXE}"
!ifdef WEB_SITE
WriteIniStr "$INSTDIR\${APP_NAME} website.url" "InternetShortcut" "URL" "${WEB_SITE}"
CreateShortCut "$SMPROGRAMS\Gain\${APP_NAME} Website.lnk" "$INSTDIR\${APP_NAME} website.url"
!endif
!endif

WriteRegStr ${REG_ROOT} "${REG_APP_PATH}" "" "$INSTDIR\${MAIN_APP_EXE}"
WriteRegStr ${REG_ROOT} "${UNINSTALL_PATH}"  "DisplayName" "${APP_NAME}"
WriteRegStr ${REG_ROOT} "${UNINSTALL_PATH}"  "UninstallString" "$INSTDIR\uninstall.exe"
WriteRegStr ${REG_ROOT} "${UNINSTALL_PATH}"  "DisplayIcon" "$INSTDIR\${MAIN_APP_EXE}"
WriteRegStr ${REG_ROOT} "${UNINSTALL_PATH}"  "DisplayVersion" "${VERSION}"
WriteRegStr ${REG_ROOT} "${UNINSTALL_PATH}"  "Publisher" "${COMP_NAME}"

!ifdef WEB_SITE
WriteRegStr ${REG_ROOT} "${UNINSTALL_PATH}"  "URLInfoAbout" "${WEB_SITE}"
!endif
SectionEnd

######################################################################

Section Uninstall
${INSTALL_TYPE}


Delete "$INSTDIR\Gain.exe"

Delete "$INSTDIR\Support\*"

Delete "$INSTDIR\maven-archiver\pom.properties"

RmDir "$INSTDIR\Support\dependency-jars"
RmDir "$INSTDIR\Support\Images"
RmDir "$INSTDIR\Support"

Delete "$INSTDIR\uninstall.exe"
!ifdef WEB_SITE
Delete "$INSTDIR\${APP_NAME} website.url"
!endif

RmDir "$INSTDIR"

!ifndef NEVER_UNINSTALL

Delete "$RESOURCES\Gain.exe"
Delete "$RESOURCES\Support\Globot_Help.html"
Delete "$RESOURCES\Support\logging.properties"
Delete "$RESOURCES\Support\toolconfig.properties"
Delete "$RESOURCES\Support\Images\about.png"
Delete "$RESOURCES\Support\Images\Android_icon.png"
Delete "$RESOURCES\Support\Images\android_platform.png"
Delete "$RESOURCES\Support\Images\apple.png"
Delete "$RESOURCES\Support\Images\apple_icon1.png"
Delete "$RESOURCES\Support\Images\apple_platform.png"
Delete "$RESOURCES\Support\Images\browser_interface.png"
Delete "$RESOURCES\Support\Images\chrome.png"
Delete "$RESOURCES\Support\Images\desktop_interface.png"
Delete "$RESOURCES\Support\Images\Documents.jpg"
Delete "$RESOURCES\Support\Images\download_report.png"
Delete "$RESOURCES\Support\Images\E-mail-icon.png"
Delete "$RESOURCES\Support\Images\E-mail_logo.png"
Delete "$RESOURCES\Support\Images\encore_logo.png"
Delete "$RESOURCES\Support\Images\exit.png"
Delete "$RESOURCES\Support\Images\FailIndicator.png"
Delete "$RESOURCES\Support\Images\firefox.png"
Delete "$RESOURCES\Support\Images\folderIcon.png"
Delete "$RESOURCES\Support\Images\gloBot_logo.png"
Delete "$RESOURCES\Support\Images\Globot_Screen_Shot1.JPG"
Delete "$RESOURCES\Support\Images\graphical_report.png"
Delete "$RESOURCES\Support\Images\Help.png"
Delete "$RESOURCES\Support\Images\Icon.png"
Delete "$RESOURCES\Support\Images\icon_execute.png"
Delete "$RESOURCES\Support\Images\IE.png"
Delete "$RESOURCES\Support\Images\iOS.png"
Delete "$RESOURCES\Support\Images\LOGO.JPG"
Delete "$RESOURCES\Support\Images\Logo3.png"
Delete "$RESOURCES\Support\Images\Logo_Icon.PNG"
Delete "$RESOURCES\Support\Images\mobile_interface.png"
Delete "$RESOURCES\Support\Images\NotExecutedIndicator.png"
Delete "$RESOURCES\Support\Images\opera.png"
Delete "$RESOURCES\Support\Images\PassIndicator.png"
Delete "$RESOURCES\Support\Images\rpro_logo.png"
Delete "$RESOURCES\Support\Images\safari.png"
Delete "$RESOURCES\Support\Images\schedule_icon.png"
Delete "$RESOURCES\Support\Images\schedule_logo.png"
Delete "$RESOURCES\Support\Images\Settings.png"
Delete "$RESOURCES\Support\Images\statistical_report.png"
Delete "$RESOURCES\Support\Images\Stop sign.png"
Delete "$RESOURCES\Support\Images\togglebutton.png"
Delete "$RESOURCES\Support\Images\toggle_bg.png"
Delete "$RESOURCES\Support\Images\toggle_check.png"
Delete "$RESOURCES\Support\Images\tool_conf.png"
Delete "$RESOURCES\Support\Images\tool_Logo.png"
Delete "$RESOURCES\Support\Images\TR_logo.png"
Delete "$RESOURCES\Support\Images\T_logo.jpg"
Delete "$RESOURCES\Support\Images\Validate.png"
Delete "$RESOURCES\Support\Images\webpac_logo.png"
Delete "$RESOURCES\Support\Images\snapshot - Logo.png"
Delete "$RESOURCES\Support\Images\snapshot.png"
Delete "$RESOURCES\Support\Images\disablesnapshot.png"
Delete "$RESOURCES\Support\dependency-jars\activation-1.1.jar"
Delete "$RESOURCES\Support\dependency-jars\bcpkix-jdk15on-1.48.jar"
Delete "$RESOURCES\Support\dependency-jars\bcprov-jdk15on-1.48.jar"
Delete "$RESOURCES\Support\dependency-jars\bsh-2.0b4.jar"
Delete "$RESOURCES\Support\dependency-jars\cglib-nodep-2.1_3.jar"
Delete "$RESOURCES\Support\dependency-jars\commons-codec-1.6.jar"
Delete "$RESOURCES\Support\dependency-jars\commons-collections-3.2.1.jar"
Delete "$RESOURCES\Support\dependency-jars\commons-exec-1.1.jar"
Delete "$RESOURCES\Support\dependency-jars\commons-io-2.2.jar"
Delete "$RESOURCES\Support\dependency-jars\commons-jxpath-1.3.jar"
Delete "$RESOURCES\Support\dependency-jars\commons-lang3-3.1.jar"
Delete "$RESOURCES\Support\dependency-jars\commons-logging-1.1.1.jar"
Delete "$RESOURCES\Support\dependency-jars\cssparser-0.9.9.jar"
Delete "$RESOURCES\Support\dependency-jars\google-collections-1.0.jar"
Delete "$RESOURCES\Support\dependency-jars\guava-14.0.jar"
Delete "$RESOURCES\Support\dependency-jars\hamcrest-core-1.2.1.jar"
Delete "$RESOURCES\Support\dependency-jars\hamcrest-integration-1.2.1.jar"
Delete "$RESOURCES\Support\dependency-jars\hamcrest-library-1.2.1.jar"
Delete "$RESOURCES\Support\dependency-jars\htmlunit-2.12.jar"
Delete "$RESOURCES\Support\dependency-jars\htmlunit-core-js-2.12.jar"
Delete "$RESOURCES\Support\dependency-jars\httpclient-4.2.1.jar"
Delete "$RESOURCES\Support\dependency-jars\httpcore-4.2.1.jar"
Delete "$RESOURCES\Support\dependency-jars\httpmime-4.2.3.jar"
Delete "$RESOURCES\Support\dependency-jars\ini4j-0.5.2.jar"
Delete "$RESOURCES\Support\dependency-jars\isorelax-20030108.jar"
Delete "$RESOURCES\Support\dependency-jars\itextpdf-5.2.0.jar"
Delete "$RESOURCES\Support\dependency-jars\jackson-annotations-2.0.0.jar"
Delete "$RESOURCES\Support\dependency-jars\jackson-core-2.0.0.jar"
Delete "$RESOURCES\Support\dependency-jars\jackson-databind-2.0.0.jar"
Delete "$RESOURCES\Support\dependency-jars\jaxb-api-2.1.jar"
Delete "$RESOURCES\Support\dependency-jars\jaxb-impl-1.0.6.jar"
Delete "$RESOURCES\Support\dependency-jars\jaxb-impl-2.1.jar"
Delete "$RESOURCES\Support\dependency-jars\jaxb-libs-1.0.6.jar"
Delete "$RESOURCES\Support\dependency-jars\jaxp-api-1.4.5.jar"
Delete "$RESOURCES\Support\dependency-jars\jcip-annotations-1.0.jar"
Delete "$RESOURCES\Support\dependency-jars\jcommander-1.27.jar"
Delete "$RESOURCES\Support\dependency-jars\jcommon-1.0.16.jar"
Delete "$RESOURCES\Support\dependency-jars\jetty-http-8.1.9.v20130131.jar"
Delete "$RESOURCES\Support\dependency-jars\jetty-io-8.1.9.v20130131.jar"
Delete "$RESOURCES\Support\dependency-jars\jetty-repacked-7.6.1.jar"
Delete "$RESOURCES\Support\dependency-jars\jetty-util-8.1.9.v20130131.jar"
Delete "$RESOURCES\Support\dependency-jars\jetty-websocket-8.1.9.v20130131.jar"
Delete "$RESOURCES\Support\dependency-jars\jfreechart-1.0.13.jar"
Delete "$RESOURCES\Support\dependency-jars\jna-3.4.0.jar"
Delete "$RESOURCES\Support\dependency-jars\jsch-0.1.49.jar"
Delete "$RESOURCES\Support\dependency-jars\json-20080701.jar"
Delete "$RESOURCES\Support\dependency-jars\json-simple-1.1.jar"
Delete "$RESOURCES\Support\dependency-jars\junit-4.8.2.jar"
Delete "$RESOURCES\Support\dependency-jars\log4j-1.2.17.jar"
Delete "$RESOURCES\Support\dependency-jars\mail-1.4.jar"
Delete "$RESOURCES\Support\dependency-jars\mockito-all-1.8.5.jar"
Delete "$RESOURCES\Support\dependency-jars\mx4j-tools-3.0.1.jar"
Delete "$RESOURCES\Support\dependency-jars\nekohtml-1.9.18.jar"
Delete "$RESOURCES\Support\dependency-jars\netty-3.5.2.Final.jar"
Delete "$RESOURCES\Support\dependency-jars\operadriver-1.5.jar"
Delete "$RESOURCES\Support\dependency-jars\operalaunchers-1.1.jar"
Delete "$RESOURCES\Support\dependency-jars\platform-3.4.0.jar"
Delete "$RESOURCES\Support\dependency-jars\protobuf-java-2.4.1.jar"
Delete "$RESOURCES\Support\dependency-jars\relaxngDatatype-20020414.jar"
Delete "$RESOURCES\Support\dependency-jars\sac-1.3.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-android-driver-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-api-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-chrome-driver-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-firefox-driver-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-htmlunit-driver-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-ie-driver-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-iphone-driver-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-java-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-remote-driver-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-safari-driver-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-server-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\selenium-support-2.33.0.jar"
Delete "$RESOURCES\Support\dependency-jars\serializer-2.7.1.jar"
Delete "$RESOURCES\Support\dependency-jars\servlet-api-2.4.jar"
Delete "$RESOURCES\Support\dependency-jars\servlet-api-2.5-6.1.9.jar"
Delete "$RESOURCES\Support\dependency-jars\slf4j-api-1.7.2.jar"
Delete "$RESOURCES\Support\dependency-jars\snakeyaml-1.8.jar"
Delete "$RESOURCES\Support\dependency-jars\stax-api-1.0-2.jar"
Delete "$RESOURCES\Support\dependency-jars\testng-6.8.7.jar"
Delete "$RESOURCES\Support\dependency-jars\util-java-6.0.2.jar"
Delete "$RESOURCES\Support\dependency-jars\webbit-0.4.14.jar"
Delete "$RESOURCES\Support\dependency-jars\xalan-2.7.1.jar"
Delete "$RESOURCES\Support\dependency-jars\xercesImpl-2.10.0.jar"
Delete "$RESOURCES\Support\dependency-jars\xml-apis-1.4.01.jar"
Delete "$RESOURCES\Support\dependency-jars\xsdlib-20060615.jar"


RmDir "$RESOURCES\Support\dependency-jars"
RmDir "$RESOURCES\Support\Images"
RmDir "$RESOURCES\Support"

!endif

!ifdef REG_START_MENU
!insertmacro MUI_STARTMENU_GETFOLDER "Application" $SM_Folder
Delete "$SMPROGRAMS\$SM_Folder\${APP_NAME}.lnk"
!ifdef WEB_SITE
Delete "$SMPROGRAMS\$SM_Folder\${APP_NAME} Website.lnk"
!endif
RmDir "$SMPROGRAMS\$SM_Folder"
!endif

!ifndef REG_START_MENU
Delete "$SMPROGRAMS\Gain\${APP_NAME}.lnk"
!ifdef WEB_SITE
Delete "$SMPROGRAMS\Gain\${APP_NAME} Website.lnk"
!endif
RmDir "$SMPROGRAMS\Gain"
!endif

DeleteRegKey ${REG_ROOT} "${REG_APP_PATH}"
DeleteRegKey ${REG_ROOT} "${UNINSTALL_PATH}"
SectionEnd

######################################################################

