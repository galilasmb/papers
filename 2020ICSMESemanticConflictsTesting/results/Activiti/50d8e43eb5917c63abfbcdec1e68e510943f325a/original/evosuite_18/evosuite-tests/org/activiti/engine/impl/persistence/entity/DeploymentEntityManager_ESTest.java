/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 17:38:47 GMT 2020
 */

package org.activiti.engine.impl.persistence.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.script.SimpleBindings;
import org.activiti.engine.impl.DeploymentQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.RuntimeServiceImpl;
import org.activiti.engine.impl.TaskServiceImpl;
import org.activiti.engine.impl.cfg.CommandExecutorImpl;
import org.activiti.engine.impl.cfg.JtaProcessEngineConfiguration;
import org.activiti.engine.impl.el.NoExecutionVariableScope;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandConfig;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.interceptor.CommandInterceptor;
import org.activiti.engine.impl.persistence.entity.AttachmentEntity;
import org.activiti.engine.impl.persistence.entity.DeploymentEntity;
import org.activiti.engine.impl.persistence.entity.DeploymentEntityManager;
import org.activiti.engine.impl.persistence.entity.HistoricProcessInstanceEntity;
import org.activiti.engine.impl.persistence.entity.ModelEntity;
import org.activiti.engine.impl.persistence.entity.TimerEntity;
import org.activiti.engine.impl.repository.DeploymentBuilderImpl;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentQuery;
import org.apache.ibatis.session.SqlSessionManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeploymentEntityManager_ESTest extends DeploymentEntityManager_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      CommandConfig commandConfig0 = new CommandConfig();
      CommandInterceptor commandInterceptor0 = null;
      CommandExecutorImpl commandExecutorImpl0 = new CommandExecutorImpl(commandConfig0, commandInterceptor0);
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl(commandExecutorImpl0);
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentName(deploymentQueryImpl0.SORTORDER_ASC);
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentTenantIdLike(deploymentQueryImpl0.SORTORDER_ASC);
      int int0 = (-896);
      Page page0 = new Page(int0, int0);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl2, page0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "Trying to call same allocXxx() method second time";
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.deleteDeployment(string0, boolean0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      RepositoryServiceImpl repositoryServiceImpl0 = new RepositoryServiceImpl();
      String string0 = "selectSignalEventSubscriptionsByEventName";
      String string1 = "=x[\"N";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.getDeploymentResourceNames(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      JtaProcessEngineConfiguration jtaProcessEngineConfiguration0 = new JtaProcessEngineConfiguration();
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      CommandContext commandContext0 = null;
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl(commandContext0);
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.processDefinitionKeyLike(jtaProcessEngineConfiguration0.DB_SCHEMA_UPDATE_TRUE);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.close();
      deploymentEntityManager0.flush();
      String string0 = "mHY1xT^g";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findLatestDeploymentByName(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "o/";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentById(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      NoExecutionVariableScope noExecutionVariableScope0 = new NoExecutionVariableScope();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      int int0 = 1643;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByNativeQuery(simpleBindings0, int0, int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByNativeQuery(simpleBindings0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.insertDeployment(deploymentEntity0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.flush();
      String string0 = "selectDeploymentCountByQueryCriteria";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentById(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "8";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.getDeploymentResourceNames(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.getDeploymentResourceNames(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "(a|;7#H";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findLatestDeploymentByName(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "org.activiti.bpmn.model.FormValue";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findLatestDeploymentByName(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      NoExecutionVariableScope noExecutionVariableScope0 = new NoExecutionVariableScope();
      Map<String, Object> map0 = noExecutionVariableScope0.getVariables();
      int int0 = 1643;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByNativeQuery(map0, int0, int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "5]";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentById(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      String string0 = "GV@3V$(V";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentId(string0);
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentName(deploymentQueryImpl0.SORTORDER_ASC);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl2);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.close();
      String string0 = "zof*.m:)+w>D.\\u 5_.";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findLatestDeploymentByName(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.flush();
      deploymentEntityManager0.close();
      CommandContext commandContext0 = null;
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl(commandContext0);
      String string0 = "FsMT4,}p;";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentCategory(string0);
      String string1 = "St;>`Yn\\nfC4PzWtw";
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentNameLike(string1);
      deploymentQueryImpl1.setDatabaseType(string1);
      DeploymentQueryImpl deploymentQueryImpl3 = deploymentQueryImpl2.deploymentTenantId(string1);
      DeploymentQueryImpl deploymentQueryImpl4 = deploymentQueryImpl3.deploymentWithoutTenantId();
      DeploymentQueryImpl deploymentQueryImpl5 = deploymentQueryImpl2.deploymentTenantIdLike(deploymentQueryImpl4.SORTORDER_ASC);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl4);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      HistoricProcessInstanceEntity historicProcessInstanceEntity0 = new HistoricProcessInstanceEntity();
      Map<String, Object> map0 = historicProcessInstanceEntity0.getProcessVariables();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByNativeQuery(map0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByNativeQuery(simpleBindings0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      RepositoryServiceImpl repositoryServiceImpl0 = new RepositoryServiceImpl();
      DeploymentBuilderImpl deploymentBuilderImpl0 = new DeploymentBuilderImpl(repositoryServiceImpl0);
      DeploymentEntity deploymentEntity0 = deploymentBuilderImpl0.getDeployment();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.insertDeployment(deploymentEntity0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      String string0 = "Z4;8Gi'rlzfmLPz";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.processDefinitionKey(string0);
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentWithoutTenantId();
      String string1 = "camelContext";
      DeploymentQueryImpl deploymentQueryImpl3 = deploymentQueryImpl2.deploymentNameLike(string1);
      String string2 = "=kBMdB:S8WGK#-b";
      DeploymentQueryImpl deploymentQueryImpl4 = deploymentQueryImpl3.deploymentTenantIdLike(string2);
      Page page0 = null;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl4, page0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentWithoutTenantId();
      String string0 = "";
      DeploymentQuery deploymentQuery0 = deploymentQueryImpl1.orderByDeploymentName();
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentTenantIdLike(string0);
      DeploymentQueryImpl deploymentQueryImpl3 = deploymentQueryImpl2.deploymentId(deploymentQueryImpl0.SORTORDER_ASC);
      DeploymentQueryImpl deploymentQueryImpl4 = deploymentQueryImpl3.deploymentCategory(deploymentQueryImpl2.SORTORDER_DESC);
      int int0 = (-479);
      int int1 = 1072;
      Page page0 = new Page(int0, int1);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl4, page0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "selectDeploymentCountByNativeQuery";
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.deleteDeployment(string0, boolean0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "";
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.deleteDeployment(string0, boolean0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }
}
