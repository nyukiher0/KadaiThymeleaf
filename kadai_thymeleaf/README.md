# KadaiThymeleaf

- 本課題において開発環境として Visual Studio Code を使用している。
- 拡張機能の特性上、アーティファクト ID としてアッパーキャメルケースを使用できない。そのため、スネークケースでアーティファクト ID を指定している。
- 所定のフォルダ名としていないため、所定のフォルダ名の一階層下にプロジェクトルートを配置している。

## ソース配置

- 開発物は`src`配下に全て配置している。
- `InputController.java`と`OutputController.java`および`input.html`と`output.html`を参照されたい。

```
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── com
    │   │   │       └── techacademy
    │   │   │           └── kadai_thymeleaf
    │   │   │               └── kadai_thymeleaf
    │   │   │                   ├── InputController.java
    │   │   │                   ├── KadaiThymeleafApplication.java
    │   │   │                   └── OutputController.java
    │   │   └── resources
    │   │       ├── application.properties
    │   │       ├── static
    │   │       └── templates
    │   │           ├── input.html
    │   │           └── output.html
    │   └── test
```
