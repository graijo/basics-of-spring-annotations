# 3-Selenium Spring  exercise

This is a java spring boot library to demo a web scenario using spring annotation.

## Installation
Create config,page classes and test classes

```bash
 \src\main\java\com\spring\selenium\config\webDriverConfig.java.
@Value("${timeout:30}")
@Bean WebDriver
@Bean WebDriverWait

src\main\java\com\spring\selenium\pages\BasePage.java
@Autowired WebDriver,WebDriverWait
@PostConstruct PageFactory.initElements(this.driver, this);

src\main\java\com\spring\selenium\pages\GooglePage.java
@Value("${url}")
@FindBy elements
Functions and overide methods(for baseClass)

src\test\java\com\spring\selenium\BaseTest.java
@SpringBootTest --> public class BaseTest extends AbstractTestNGSpringContextTests 

src\test\java\com\spring\selenium\GoogleSpringBootTestNGTest.java
@Autowired GooglePage
@Test -->call page methods inside test method
```

## Usage

```
java spring
```

## Contributing

3rd example of spring java bdd course, better keep it as it is.



## License

[MIT](https://choosealicense.com/licenses/mit/)