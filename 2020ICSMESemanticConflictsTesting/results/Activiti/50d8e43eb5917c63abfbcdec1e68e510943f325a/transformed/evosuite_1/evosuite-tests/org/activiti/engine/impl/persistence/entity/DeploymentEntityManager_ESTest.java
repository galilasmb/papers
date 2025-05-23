/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 20:02:20 GMT 2020
 */

package org.activiti.engine.impl.persistence.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.script.Bindings;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;
import org.activiti.engine.impl.DeploymentQueryImpl;
import org.activiti.engine.impl.EventSubscriptionQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.RuntimeServiceImpl;
import org.activiti.engine.impl.cfg.CommandExecutorImpl;
import org.activiti.engine.impl.cfg.JtaProcessEngineConfiguration;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandConfig;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.interceptor.CommandContextFactory;
import org.activiti.engine.impl.interceptor.CommandContextInterceptor;
import org.activiti.engine.impl.interceptor.CommandExecutor;
import org.activiti.engine.impl.interceptor.CommandInterceptor;
import org.activiti.engine.impl.interceptor.CommandInvoker;
import org.activiti.engine.impl.interceptor.LogInterceptor;
import org.activiti.engine.impl.persistence.deploy.DeploymentManager;
import org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity;
import org.activiti.engine.impl.persistence.entity.DeploymentEntity;
import org.activiti.engine.impl.persistence.entity.DeploymentEntityManager;
import org.activiti.engine.impl.persistence.entity.HistoricTaskInstanceEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.persistence.entity.ResourceEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.repository.DeploymentBuilderImpl;
import org.activiti.engine.impl.scripting.JuelScriptEngineFactory;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.repository.DeploymentQuery;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeploymentEntityManager_ESTest extends DeploymentEntityManager_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      RepositoryServiceImpl repositoryServiceImpl0 = new RepositoryServiceImpl();
      DeploymentBuilderImpl deploymentBuilderImpl0 = new DeploymentBuilderImpl(repositoryServiceImpl0);
      DeploymentEntity deploymentEntity0 = deploymentBuilderImpl0.getDeployment();
      deploymentEntityManager0.close();
      String string0 = "vV#ib/6JTP";
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
  public void test01()  throws Throwable  {
      LogInterceptor logInterceptor0 = new LogInterceptor();
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      String string0 = null;
      String string1 = "AJ,/po";
      String string2 = "+U[cg.W";
      int int0 = (-2398);
      int int1 = 0;
      Page page0 = new Page(int0, int1);
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      CommandExecutor commandExecutor0 = null;
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl(commandExecutor0);
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
  public void test02()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = " l0Qjw^k6|Y}ku2NlD";
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
  public void test03()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "}GOjfOkMFi.";
      TaskEntity taskEntity0 = new TaskEntity(string0);
      Map<String, Object> map0 = taskEntity0.getActivityInstanceVariables();
      int int0 = 0;
      int int1 = 1;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByNativeQuery(map0, int0, int1);
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
      String string0 = "org.activiti.engine.impl.variable.IntegerType";
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
  public void test05()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      ScriptEngineManager scriptEngineManager0 = new ScriptEngineManager();
      Bindings bindings0 = scriptEngineManager0.getBindings();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByNativeQuery(bindings0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      String string0 = "]%}lcC=n&zs_";
      String string1 = "2x[ihC RZ";
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      String string0 = "]%}lcC=n&zs_";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentName(string0);
      String string1 = "2x[ihC RZ";
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentTenantId(string1);
      DeploymentQueryImpl deploymentQueryImpl3 = deploymentQueryImpl2.deploymentTenantIdLike(deploymentQueryImpl1.SORTORDER_ASC);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl3);
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
      deploymentEntityManager0.flush();
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      Map<String, ResourceEntity> map0 = deploymentEntity0.getResources();
      String string0 = "org.activiti.bpmn.model.Message";
      deploymentEntity0.name = string0;
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
      String string0 = ",%oS,C5isF0>O~";
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
  public void test11()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "V4|SZ-#OQMtxro} L\\%";
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
  public void test12()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.close();
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "-o#";
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
  public void test14()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      int int0 = 324;
      Page page0 = new Page(int0, int0);
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
  public void test15()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      Map<String, Object> map0 = null;
      int int0 = (-150);
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
  public void test16()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = null;
      int int0 = (-185);
      int int1 = 537;
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
  public void test17()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "VOO,'mK#KIx";
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
  public void test18()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = null;
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
  public void test19()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      String string0 = "";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentCategoryNotEquals(string0);
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentTenantIdLike(deploymentQueryImpl0.SORTORDER_DESC);
      String string1 = "timer-start-event";
      DeploymentQueryImpl deploymentQueryImpl3 = deploymentQueryImpl2.deploymentTenantId(string1);
      DeploymentQueryImpl deploymentQueryImpl4 = deploymentQueryImpl3.deploymentTenantIdLike(deploymentQueryImpl1.SORTORDER_DESC);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl3);
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
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      int int0 = 324;
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
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      boolean boolean0 = false;
      classLoader0.setDefaultAssertionStatus(boolean0);
      ScriptEngineManager scriptEngineManager0 = new ScriptEngineManager(classLoader1);
      ClassLoader classLoader2 = classLoader1.getParent();
      ClassLoader classLoader3 = classLoader1.getParent();
      String string0 = "";
      JuelScriptEngineFactory juelScriptEngineFactory0 = new JuelScriptEngineFactory();
      scriptEngineManager0.registerEngineMimeType(string0, juelScriptEngineFactory0);
      String string1 = "9W-";
      ClassLoader classLoader4 = classLoader0.getParent();
      Object object0 = scriptEngineManager0.get(string1);
      Bindings bindings0 = scriptEngineManager0.getBindings();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByNativeQuery(bindings0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }
}
