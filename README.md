# Codename One Project

This is a Maven project for a Codename One app. The app lives in `common/`, and every platform is built from it: there is no per-platform module until you add one.
You can write the app in Java and/or Kotlin, and build for Android, iOS, desktop, and web.

## Getting Started

Use JDK 17 or newer for this project's selected Java level. Configure your IDE's project SDK and Maven runner, and set JAVA_HOME for terminal builds. An IDE's bundled runtime does not necessarily configure either.

Extract the entire ZIP, then open the root pom.xml as a Maven project. Use a terminal so errors remain visible.

Windows PowerShell or Command Prompt:

```
.\mvnw.cmd -v
.\build.bat javascript_cloud
```

macOS/Linux:

```
./mvnw -v
./build.sh javascript_cloud
```

Check that Maven reports the required JDK. The first cloud build opens your browser and asks you to sign in or create a free Codename One account; local builds need no account. The first build downloads dependencies and can take several minutes. If a download fails, check your connection or Maven proxy settings and retry.

The javascript command builds locally; javascript_cloud submits a hosted build. With no target, build makes a local JAR and run starts the local simulator. These local operations do not create a cloud build.

## VS Code Users

Open the project folder in VS Code and make sure Java + Maven extensions are installed.

## Build progress reporting

This project tells Codename One when a build starts and how it ended -- from `build.sh` and `build.bat`, and from Maven when your IDE runs the build -- so we can see where first builds get stuck. It sends only a one-way hash of the package name (never the name itself), the build target, the OS family, the Java version, the exit code, a one-word failure reason and the duration, to https://cloud.codenameone.com/api/v2/funnel/initializr-event, plus which tool ran the build (IntelliJ, Eclipse, NetBeans, VS Code or the command line). Never your code, paths, user name or build output.

To opt out, set `CN1_TELEMETRY` to `0` in the environment the build runs in:

- macOS/Linux: `export CN1_TELEMETRY=0`
- Windows PowerShell: `$Env:CN1_TELEMETRY = "0"`
- Windows Command Prompt: `set CN1_TELEMETRY=0`

or delete the `cn1.telemetry.project` and `cn1.telemetry.events` entries from `pom.xml`.

## Native Code

Native interface implementations go in a directory per platform beside `common/`, for example `android/src/main/java` or `ios/src/main/objectivec`. `mvn cn1:generate-native-interfaces` creates them, and the build picks them up from there.

## Signing

Use the Certificate Wizard to configure Apple signing assets, Android keystores, and desktop signing settings:

```
mvn cn1:certificatewizard
```

Generated IDE projects include a Certificate Wizard action under their tools/favorites area.

## Help and Support

- Codename One website: https://www.codenameone.com
- Codename One GitHub: https://github.com/codenameone/CodenameOne
