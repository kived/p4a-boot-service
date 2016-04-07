# p4a-boot-service
boot service example for python-for-android

1. Build the dist (`build_dist.sh`)
2. Modify the file `~/.local/share/python-for-android/dists/servtest/templates/AndroidManifest.tmpl.xml`:
    1. Add the following code inside the `<application />` tag:

        ```
        <receiver android:name=".BootCompletedReceiver" android:enabled="true">
            <intent-filter>
                <action android:name="android.intent.action.BOOT_COMPLETED" />
                <category android:name="android.intent.category.MAIN" />
            </intent-filter>
        </receiver>
        ```

    2. Or copy the provided `AndroidManifest.tmpl.xml` over the file
3. Build the APK (`build_apk.sh`)
4. Install the APK (`adb install -r ServiceTest-1.0-debug.apk`)
5. **Run the app** - if you don't run the app, the boot receiver will not be registered
