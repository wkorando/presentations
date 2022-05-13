# Write Reliable Tests 
vv
## Test Containers
```java
public static class Initializer 
    implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        TestPropertyValues.of("spring.datasource.url=" + postgres.getJdbcUrl(), //
                "spring.datasource.username=" + postgres.getUsername(), //
                "spring.datasource.password=" + postgres.getPassword(),
                "spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL95Dialect") //
                .applyTo(applicationContext);
    }
}
static DockerImageName postgresHoteldbLatest = 
    DockerImageName.parse("postgres-hoteldb:latest")
    .asCompatibleSubstituteFor("postgres");
private static PostgreSQLContainer<?> postgres =    
    new PostgreSQLContainer<>(postgresHoteldbLatest);

@RegisterExtension
static SpringTestContainersExtension extension = 
    new SpringTestContainersExtension(postgres, true);
```
vv
## Test Containers
* Test against local containerized instances of remote services
* Don’t have to worry about:
    * Service being down
    * Test data going missing
    * Maintaining a local instance
vv
## Performance Testing
### JFRUnit
* Capture JDK Flight Recorder (JFR) Events to track system performance behavior
* Check JVM behavior consistent across systems and environments
vv
## Contract Driven Development
* Contracts validate service fulfill defined behavior
* Contracts can be used to setup up mock of service
