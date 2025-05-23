/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 17:18:37 GMT 2020
 */

package org.activiti.engine.impl.persistence.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import javax.script.Bindings;
import javax.script.ScriptEngineManager;
import javax.transaction.TransactionManager;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.delegate.VariableScope;
import org.activiti.engine.impl.AbstractQuery;
import org.activiti.engine.impl.DeploymentQueryImpl;
import org.activiti.engine.impl.Direction;
import org.activiti.engine.impl.GroupQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.RuntimeServiceImpl;
import org.activiti.engine.impl.TaskServiceImpl;
import org.activiti.engine.impl.bpmn.parser.BpmnParse;
import org.activiti.engine.impl.bpmn.parser.BpmnParser;
import org.activiti.engine.impl.cfg.CommandExecutorImpl;
import org.activiti.engine.impl.cfg.JtaProcessEngineConfiguration;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.activiti.engine.impl.db.DbIdGenerator;
import org.activiti.engine.impl.el.NoExecutionVariableScope;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandConfig;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.interceptor.CommandExecutor;
import org.activiti.engine.impl.interceptor.CommandInvoker;
import org.activiti.engine.impl.interceptor.JtaRetryInterceptor;
import org.activiti.engine.impl.jobexecutor.DefaultJobExecutor;
import org.activiti.engine.impl.jobexecutor.JobHandler;
import org.activiti.engine.impl.persistence.entity.ByteArrayEntity;
import org.activiti.engine.impl.persistence.entity.DeploymentEntity;
import org.activiti.engine.impl.persistence.entity.DeploymentEntityManager;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.HistoricProcessInstanceEntity;
import org.activiti.engine.impl.persistence.entity.HistoricTaskInstanceEntity;
import org.activiti.engine.impl.persistence.entity.IdentityLinkEntity;
import org.activiti.engine.impl.persistence.entity.MessageEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.persistence.entity.TimerEntity;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl;
import org.activiti.engine.impl.pvm.process.TransitionImpl;
import org.activiti.engine.impl.pvm.runtime.ExecutionImpl;
import org.activiti.engine.impl.repository.DeploymentBuilderImpl;
import org.activiti.engine.impl.scripting.JuelScriptEngineFactory;
import org.activiti.engine.impl.scripting.ResolverFactory;
import org.activiti.engine.impl.scripting.ScriptBindingsFactory;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentQuery;
import org.activiti.image.impl.DefaultProcessDiagramGenerator;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeploymentEntityManager_ESTest extends DeploymentEntityManager_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.close();
      String string0 = "*4[|| ~vh";
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
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "6?a4[YBA}7p]]";
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
  public void test02()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.flush();
      CommandConfig commandConfig0 = new CommandConfig();
      JtaProcessEngineConfiguration jtaProcessEngineConfiguration0 = new JtaProcessEngineConfiguration();
      TransactionManager transactionManager0 = jtaProcessEngineConfiguration0.getTransactionManager();
      JtaRetryInterceptor jtaRetryInterceptor0 = new JtaRetryInterceptor(transactionManager0);
      CommandExecutorImpl commandExecutorImpl0 = new CommandExecutorImpl(commandConfig0, jtaRetryInterceptor0);
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl(commandExecutorImpl0);
      int int0 = 20;
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
  public void test03()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "?lR0A{|M8U";
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
  public void test04()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      Command<TimerEntity> command0 = (Command<TimerEntity>) mock(Command.class, new ViolatedAssumptionAnswer());
      ProcessEngineConfigurationImpl processEngineConfigurationImpl0 = null;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ScriptEngineManager scriptEngineManager0 = new ScriptEngineManager(classLoader0);
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
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      MessageEntity messageEntity0 = new MessageEntity();
      String string0 = "javax.net.ssl.SSLSocketFactory";
      EvoSuiteFile evoSuiteFile0 = null;
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)59;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-124);
      byteArray0[2] = byte2;
      byte byte3 = (byte)37;
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-1);
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-97);
      byteArray0[6] = byte6;
      boolean boolean0 = FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      String string1 = "&5sC$-j\\5Dj<j70";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentById(string1);
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
  public void test08()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      Map<String, Object> map0 = executionImpl0.getVariablesLocal();
      int int0 = 0;
      int int1 = 1361;
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
  public void test09()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = null;
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
  public void test10()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "";
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      HistoricTaskInstanceEntity historicTaskInstanceEntity0 = new HistoricTaskInstanceEntity();
      Map<String, Object> map0 = historicTaskInstanceEntity0.getProcessVariables();
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
  public void test13()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "': ";
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
  public void test14()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      HistoricTaskInstanceEntity historicTaskInstanceEntity0 = new HistoricTaskInstanceEntity();
      Map<String, Object> map0 = historicTaskInstanceEntity0.getTaskLocalVariables();
      int int0 = (-491);
      int int1 = 55;
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
  public void test15()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "8wv#oSVKi5r\\C";
      ProcessDefinitionImpl processDefinitionImpl0 = new ProcessDefinitionImpl(string0);
      TransitionImpl transitionImpl0 = new TransitionImpl(string0, processDefinitionImpl0);
      ActivityImpl activityImpl0 = transitionImpl0.getSource();
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl0);
      Map<String, Object> map0 = executionImpl0.getVariables();
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
  public void test16()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = null;
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
  public void test17()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      Map<String, Object> map0 = null;
      int int0 = 0;
      int int1 = 125;
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
  public void test18()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "r5";
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
  public void test19()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      String string0 = "selectDeploymentCountByNativeQuery";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.processDefinitionKey(string0);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl1);
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
  public void test21()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "KF) R]'gvS-v%sM&[zk";
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
  public void test22()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      TaskServiceImpl taskServiceImpl0 = new TaskServiceImpl();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      String string0 = "timestamp";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentName(string0);
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentTenantIdLike(string0);
      int int0 = 0;
      int int1 = 19;
      Page page0 = new Page(int0, int1);
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
}
