# coco

## 概要

thymeleaf・DTOを勉強するために作成したリポジトリ

## MyBatis

### 実行方法

下記コマンドでMyBatisGeneratorを起動し、

- XxxMapper.xml
- XxxMapper.java
- Xxx.java

を自動的に作成できる。

```
./gradlew mbGenerator
```

Mapperには`@Mapper`アノテーションを付ける必要がある。

### generatorConfig.xml

[公式ページ](https://mybatis.org/generator/index.html)

- javaModelGenerator
  - ドメインモデル
- sqlMapGenerator
  - mapper.xml
- javaClientGenerator
  - mapper.java

sqlMapGeneratorとjavaClientGeneratorのtargetPackageが異なる場合、[application.properties](src/main/resources/application.properties)にて下記を設定する 
```
mybatis.mapper-locations=classpath*:/db/mapper/*.xml
```

`/db/mapper/`部分は、XxxMapper.xmlがあるディレクトリを指定する。