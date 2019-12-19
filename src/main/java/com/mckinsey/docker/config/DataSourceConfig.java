package com.mckinsey.docker.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories("com.journaldev.spring.repository")
public class DataSourceConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceConfig.class);
	
	public DataSourceConfig() {

	}

	/*
	 * private final String PROPERTY_SHOW_SQL = "hibernate.show_sql"; private final
	 * String PROPERTY_DIALECT = "hibernate.dialect";
	 * 
	 * @Autowired Environment environment;
	 * 
	 * @Value("${spring.datasource.url}") private String databaseURL;
	 * 
	 * @Value("${spring.datasource.username}") private String dbUserName;
	 * 
	 * @Value("${spring.datasource.password}") private String dbPassword;
	 * 
	 * @Value("${spring.datasource.driver-class-name}") private String jdbcDriver;
	 * 
	 * @Value("${spring.jpa.properties.hibernate.dialect}") private String dialect;
	 * 
	 * @Bean LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	 * LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new
	 * LocalContainerEntityManagerFactoryBean();
	 * entityManagerFactoryBean.setDataSource(dataSource());
	 * //entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistence.
	 * class); entityManagerFactoryBean.setJpaVendorAdapter(new
	 * HibernateJpaVendorAdapter());
	 * entityManagerFactoryBean.setPackagesToScan("com.mckinsey.creditmodel.domain")
	 * ; entityManagerFactoryBean.setJpaProperties(hibernateProps()); return
	 * entityManagerFactoryBean; }
	 * 
	 * @Bean DataSource dataSource() { DriverManagerDataSource dataSource = new
	 * DriverManagerDataSource(); dataSource.setUrl(databaseURL);
	 * dataSource.setUsername(dbUserName); dataSource.setPassword(dbPassword);
	 * dataSource.setDriverClassName(jdbcDriver);
	 * 
	 * LOGGER.debug("dbUserName " + dbUserName); LOGGER.debug("dbPassword " +
	 * dbPassword); LOGGER.debug("databaseURL " + databaseURL); return dataSource; }
	 * 
	 * Properties hibernateProps() { Properties properties = new Properties();
	 * properties.setProperty(PROPERTY_DIALECT, dialect);
	 * properties.setProperty(PROPERTY_SHOW_SQL, "true"); return properties; }
	 * 
	 * @Bean JpaTransactionManager transactionManager() { JpaTransactionManager
	 * transactionManager = new JpaTransactionManager();
	 * transactionManager.setEntityManagerFactory(entityManagerFactory().getObject()
	 * ); return transactionManager; }
	 */
}
