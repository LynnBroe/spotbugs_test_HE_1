# spotbugs_test_HE_1
 test repo about HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS


**spotbugs Version: 4.7.3** 

**jdk Version: 11.0.17** 

`src` folder: places source files. All the files have the same content.

`test_only_TestA` folder: contains `TestA` class files

`test_all` folder: contains all class files

`test_only_TestA.xml`: use spotbugs only to analyze `TestA`. `HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS` can be detected.

`test_all.xml`: use spotbugs to analyze all the files. Only `TestA` and `TestF` can detect `HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS`.

Since all the files are same, then all the analysis resutlt should be same. `HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS` should be detected in each file.