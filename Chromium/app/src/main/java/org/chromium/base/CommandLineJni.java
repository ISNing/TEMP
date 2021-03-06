package org.chromium.base;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class CommandLineJni implements CommandLine.Natives {
  private static CommandLine.Natives testInstance;

  public static final JniStaticTestMocker<CommandLine.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.CommandLine.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.CommandLine.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void init(String[] args) {
    N.MDkrKi31(args);
  }

  @Override
  public boolean hasSwitch(String switchString) {
    return (boolean)N.MsCvypjU(switchString);
  }

  @Override
  public String getSwitchValue(String switchString) {
    return (String)N.MZJ2lrZY(switchString);
  }

  @Override
  public void appendSwitch(String switchString) {
    N.M5K_ewhl(switchString);
  }

  @Override
  public void appendSwitchWithValue(String switchString, String value) {
    N.MUoYiNbY(switchString, value);
  }

  @Override
  public void appendSwitchesAndArguments(String[] array) {
    N.MPquHBNa(array);
  }

  @Override
  public void removeSwitch(String switchString) {
    N.M1cMYXGO(switchString);
  }

  public static CommandLine.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.CommandLine.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CommandLineJni();
  }
}
