# Change log

-Rx-CombineTuple-KT 1.2.1 (2021-02-10)
--------------------------------

- Fix a distribution issue causing the kotlin META-INF/*.kotlin_module to be called build.kotlin_module

-Rx-CombineTuple-KT 1.2.0 (2020-12-19)
--------------------------------

- Make into pure-JVM library to enable compatibility with non-Android projects.

- Restrict input types to match `@NonNull` of Rx's types (fix warnings).

-Rx-CombineTuple-KT 1.1.0 (2020-03-29)
--------------------------------

- ADD: `zipTuple` method that can `zip` together `Single`s into tuples. (thanks @dptsolutions)

-Rx-CombineTuple-KT 1.0.0 (2020-03-23)
--------------------------------

- Initial Release.