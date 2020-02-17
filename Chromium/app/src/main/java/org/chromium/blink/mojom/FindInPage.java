// FindInPage.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/find_in_page.mojom
//

package org.chromium.blink.mojom;


public interface FindInPage extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FindInPage, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FindInPage, FindInPage.Proxy> MANAGER = FindInPage_Internal.MANAGER;


    void find(
int requestId, String searchText, FindOptions options);



    void stopFinding(
int action);



    void clearActiveFindMatch(
);



    void getNearestFindResult(
org.chromium.gfx.mojom.PointF point, 
GetNearestFindResultResponse callback);

    interface GetNearestFindResultResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Float> { }



    void activateNearestFindResult(
int requestId, org.chromium.gfx.mojom.PointF point);



    void setClient(
FindInPageClient client);



    void findMatchRects(
int currentVersion, 
FindMatchRectsResponse callback);

    interface FindMatchRectsResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Integer, org.chromium.gfx.mojom.RectF[], org.chromium.gfx.mojom.RectF> { }


}