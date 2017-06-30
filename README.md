# android-invoke-adobe-AIR

Android native calls flash (on separate Intent) through AIR-runtime (currently AIR 26).

I found some useful details and Proof of concept in here:
http://www.ithao123.cn/content-8903971.html

## Updating AIR SDK

To use different AIR SDK version, few files in `libs` folder have to be updated:
* **runtimeClasses.jar** - You can find it in `${AIR_SDK} / lib / android / lib`
* **AppEntry_release.jar** - This file is inside `${AIR_SDK} / lib / adt.jar`. To get it out you can extract `adt.jar` (by renaming to `.zip` and using 7zip for example) and then look inside `com / adobe / air / apk / Dex`
* **\*.so** files in **armeabi-v7a** - Those guys can be found inside `${AIR_SDK} / runtimes / air / android / device / Runtime.apk`. File can be extracted (after renaming it to `.zip`) and `*.so` files are hiding inside `lib / armeabi-v7a`

Last but not least:
* Inside `assets / META-INF / AIR / application.xml`, `<application xmlns="http://ns.adobe.com/air/application/XX.0">` has to be updated with current SDK version.