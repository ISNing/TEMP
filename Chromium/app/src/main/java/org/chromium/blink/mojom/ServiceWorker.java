// ServiceWorker.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/service_worker.mojom
//

package org.chromium.blink.mojom;


public interface ServiceWorker extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ServiceWorker, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ServiceWorker, ServiceWorker.Proxy> MANAGER = ServiceWorker_Internal.MANAGER;


    void initializeGlobalScope(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported serviceWorkerHost, ServiceWorkerRegistrationObjectInfo registrationInfo, ServiceWorkerObjectInfo serviceWorkerInfo, int fetchHandlerExistence);



    void dispatchInstallEvent(

DispatchInstallEventResponse callback);

    interface DispatchInstallEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Boolean> { }



    void dispatchActivateEvent(

DispatchActivateEventResponse callback);

    interface DispatchActivateEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchBackgroundFetchAbortEvent(
BackgroundFetchRegistration registration, 
DispatchBackgroundFetchAbortEventResponse callback);

    interface DispatchBackgroundFetchAbortEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchBackgroundFetchClickEvent(
BackgroundFetchRegistration registration, 
DispatchBackgroundFetchClickEventResponse callback);

    interface DispatchBackgroundFetchClickEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchBackgroundFetchFailEvent(
BackgroundFetchRegistration registration, 
DispatchBackgroundFetchFailEventResponse callback);

    interface DispatchBackgroundFetchFailEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchBackgroundFetchSuccessEvent(
BackgroundFetchRegistration registration, 
DispatchBackgroundFetchSuccessEventResponse callback);

    interface DispatchBackgroundFetchSuccessEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchCookieChangeEvent(
org.chromium.network.mojom.CookieChangeInfo change, 
DispatchCookieChangeEventResponse callback);

    interface DispatchCookieChangeEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchFetchEventForMainResource(
DispatchFetchEventParams params, ServiceWorkerFetchResponseCallback responseCallback, 
DispatchFetchEventForMainResourceResponse callback);

    interface DispatchFetchEventForMainResourceResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchNotificationClickEvent(
String notificationId, NotificationData notificationData, int actionIndex, org.chromium.mojo_base.mojom.String16 reply, 
DispatchNotificationClickEventResponse callback);

    interface DispatchNotificationClickEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchNotificationCloseEvent(
String notificationId, NotificationData notificationData, 
DispatchNotificationCloseEventResponse callback);

    interface DispatchNotificationCloseEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchPushEvent(
String payload, 
DispatchPushEventResponse callback);

    interface DispatchPushEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchPushSubscriptionChangeEvent(
PushSubscription oldSubscription, PushSubscription newSubscription, 
DispatchPushSubscriptionChangeEventResponse callback);

    interface DispatchPushSubscriptionChangeEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchSyncEvent(
String tag, boolean lastChance, org.chromium.mojo_base.mojom.TimeDelta timeout, 
DispatchSyncEventResponse callback);

    interface DispatchSyncEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchPeriodicSyncEvent(
String tag, org.chromium.mojo_base.mojom.TimeDelta timeout, 
DispatchPeriodicSyncEventResponse callback);

    interface DispatchPeriodicSyncEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchAbortPaymentEvent(
org.chromium.payments.mojom.PaymentHandlerResponseCallback resultOfAbortPayment, 
DispatchAbortPaymentEventResponse callback);

    interface DispatchAbortPaymentEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchCanMakePaymentEvent(
org.chromium.payments.mojom.CanMakePaymentEventData eventData, org.chromium.payments.mojom.PaymentHandlerResponseCallback resultOfCanMakePayment, 
DispatchCanMakePaymentEventResponse callback);

    interface DispatchCanMakePaymentEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchPaymentRequestEvent(
org.chromium.payments.mojom.PaymentRequestEventData requestData, org.chromium.payments.mojom.PaymentHandlerResponseCallback responseCallback, 
DispatchPaymentRequestEventResponse callback);

    interface DispatchPaymentRequestEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchExtendableMessageEvent(
ExtendableMessageEvent event, 
DispatchExtendableMessageEventResponse callback);

    interface DispatchExtendableMessageEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dispatchContentDeleteEvent(
String id, 
DispatchContentDeleteEventResponse callback);

    interface DispatchContentDeleteEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void ping(

PingResponse callback);

    interface PingResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setIdleTimerDelayToZero(
);



    void addMessageToConsole(
int level, String message);


}
