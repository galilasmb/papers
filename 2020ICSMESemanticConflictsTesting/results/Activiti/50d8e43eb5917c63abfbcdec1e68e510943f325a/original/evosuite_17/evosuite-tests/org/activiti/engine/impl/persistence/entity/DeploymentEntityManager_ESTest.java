/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 17:36:20 GMT 2020
 */

package org.activiti.engine.impl.persistence.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.LinkedBlockingDeque;
import javax.script.SimpleBindings;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.impl.DeploymentQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.RuntimeServiceImpl;
import org.activiti.engine.impl.TaskServiceImpl;
import org.activiti.engine.impl.cfg.JtaProcessEngineConfiguration;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.activiti.engine.impl.db.PersistentObject;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.interceptor.CommandExecutor;
import org.activiti.engine.impl.jobexecutor.DefaultJobExecutor;
import org.activiti.engine.impl.persistence.deploy.DeploymentManager;
import org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity;
import org.activiti.engine.impl.persistence.entity.DeploymentEntity;
import org.activiti.engine.impl.persistence.entity.DeploymentEntityManager;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.HistoricProcessInstanceEntity;
import org.activiti.engine.impl.persistence.entity.HistoricTaskInstanceEntity;
import org.activiti.engine.impl.persistence.entity.IdentityLinkEntity;
import org.activiti.engine.impl.persistence.entity.JobEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.persistence.entity.ResourceEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.repository.DeploymentBuilderImpl;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentQuery;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeploymentEntityManager_ESTest extends DeploymentEntityManager_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "jLrC<p1C,\"y\\:E7";
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
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "selectResourceNamesByDeploymentId";
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
  public void test03()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = null;
      deploymentEntityManager0.close();
      Map<String, Object> map0 = null;
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
  public void test04()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = null;
      int int0 = 64;
      int int1 = 0;
      Page page0 = new Page(int0, int1);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl0, page0);
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
      boolean boolean0 = false;
      String string0 = "!k";
      boolean boolean1 = false;
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
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
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      byte byte0 = (byte)0;
      byte byte1 = (byte)0;
      byte byte2 = (byte)5;
      byte byte3 = (byte)3;
      byte byte4 = (byte) (-55);
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      HistoricProcessInstanceEntity historicProcessInstanceEntity0 = new HistoricProcessInstanceEntity();
      Map<String, Object> map0 = historicProcessInstanceEntity0.getProcessVariables();
      Map<String, Object> map1 = historicProcessInstanceEntity0.getProcessVariables();
      int int0 = 0;
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
  public void test07()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.flush();
      String string0 = "selectResourceNamesByDeploymentId";
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
  public void test08()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "org.activiti.engine.impl.persistence.entity.DeploymentEntityManager";
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
  public void test09()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.flush();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      int int0 = (-1);
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
  public void test10()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "jsonValue";
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
  public void test11()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "UqF/}Fn[d!c_)\"eX6<";
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = "deleteDeployment";
      Object object0 = null;
      Object object1 = hashMap0.put(string0, object0);
      int int0 = 0;
      int int1 = 0;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByNativeQuery(hashMap0, int0, int1);
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
      String string0 = "";
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
      deploymentEntityManager0.close();
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DefaultJobExecutor defaultJobExecutor0 = new DefaultJobExecutor();
      CommandExecutor commandExecutor0 = defaultJobExecutor0.getCommandExecutor();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl(commandExecutor0);
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
  public void test17()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      String string0 = "";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentTenantIdLike(string0);
      String string1 = "";
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentId(string1);
      String string2 = "r/W2LE";
      DeploymentQueryImpl deploymentQueryImpl3 = deploymentQueryImpl2.deploymentCategoryNotEquals(string2);
      int int0 = (-1116);
      Page page0 = new Page(int0, int0);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl3, page0);
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
      String string0 = "";
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
  public void test19()  throws Throwable  {
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
}
