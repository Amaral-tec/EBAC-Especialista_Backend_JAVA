package br.com.amaral;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ClienteDAOTest.class, ClienteServiceTest.class})
public class AllTests {

}
