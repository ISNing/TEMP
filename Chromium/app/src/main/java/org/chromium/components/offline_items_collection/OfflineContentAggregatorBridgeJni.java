package org.chromium.components.offline_items_collection;

import J.N;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OfflineContentAggregatorBridgeJni implements OfflineContentAggregatorBridge.Natives {
  private static OfflineContentAggregatorBridge.Natives testInstance;

  public static final JniStaticTestMocker<OfflineContentAggregatorBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void openItem(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, int location, String nameSpace, String id) {
    N.MXureVYk(nativeOfflineContentAggregatorBridge, caller, location, nameSpace, id);
  }

  @Override
  public void removeItem(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id) {
    N.MGbhWq61(nativeOfflineContentAggregatorBridge, caller, nameSpace, id);
  }

  @Override
  public void cancelDownload(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id) {
    N.Mwk11G0z(nativeOfflineContentAggregatorBridge, caller, nameSpace, id);
  }

  @Override
  public void pauseDownload(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id) {
    N.MBvrmOCy(nativeOfflineContentAggregatorBridge, caller, nameSpace, id);
  }

  @Override
  public void resumeDownload(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id, boolean hasUserGesture) {
    N.MSy1v2e$(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, hasUserGesture);
  }

  @Override
  public void getItemById(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id,
      Callback<OfflineItem> callback) {
    N.MJYXvOtL(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, callback);
  }

  @Override
  public void getAllItems(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, Callback<ArrayList<OfflineItem>> callback) {
    N.MWgZa2II(nativeOfflineContentAggregatorBridge, caller, callback);
  }

  @Override
  public void getVisualsForItem(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id,
      VisualsCallback callback) {
    N.MwOuZAaJ(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, callback);
  }

  @Override
  public void getShareInfoForItem(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id, ShareCallback callback) {
    N.M8AqLjBj(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, callback);
  }

  @Override
  public void renameItem(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id, String name,
      Callback<Integer> callback) {
    N.MnGmsa$g(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, name, callback);
  }

  public static OfflineContentAggregatorBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new OfflineContentAggregatorBridgeJni();
  }
}
