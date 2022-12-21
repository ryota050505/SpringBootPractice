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

~~Mapperには`@Mapper`アノテーションを付ける必要がある。~~

generatorConfig.xmlにて

```xml
<plugin type="org.mybatis.generator.plugins.MapperAnnotationPlugin">
  <property name="@Mapper" value="true"/>
</plugin>
```

のようにpluginを記載することで自動的に付与が可能



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

### Entityへのアノテーション付与

[com.itfsw:mybatis-generator-plugin](https://mvnrepository.com/artifact/com.itfsw/mybatis-generator-plugin/1.3.10)を使用する。  
使用方法はgeneratorConfig.xmlにて

```xml
<!-- エンティティクラスでLombokを使用するためのプラグイン -->
<plugin type="com.itfsw.mybatis.generator.plugins.LombokPlugin">
    <property name="@Data" value="true"/>
    <property name="@Builder" value="true"/>
    <property name="@AllArgsConstructor" value="true"/>
    <property name="@NoArgsConstructor" value="true"/>
    <property name="@Accessors(chain = true)" value="false"/>
    <property name="supportSuperBuilderForIdea" value="false"/>
</plugin>
```

でアノテーションの付与が可能となる。

自作でのCustom Pluginの作成も可能だが、その場合は他プロジェクトで一旦buildし、.jarファイルにする必要がある。

（そして子プロジェクトの作成がかなり面倒だったので今回は無し）