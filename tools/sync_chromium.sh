#!/bin/bash

set -e

PRO_DIR="/home/chiashuen/TEMP/Chromium"
BASE_DIR="/home/chiashuen/chromium/src"
RELEASE_DIR="${BASE_DIR}/out/x64-release"
APP_DIR="${PRO_DIR}/app"
MODULES_DIR="${PRO_DIR}"

sync_android_webview() {
	cp -r ${BASE_DIR}/android_webview/glue/java/src/* \
                ${BASE_DIR}/android_webview/java/src/* \
                ${BASE_DIR}/android_webview/nonembedded/java/src/* \
                ${BASE_DIR}/android_webview/support_library/boundary_interfaces/src/* \
                ${BASE_DIR}/android_webview/support_library/callback/java/src/* \
                ${BASE_DIR}/android_webview/support_library/java/src/* \
                ${BASE_DIR}/android_webview/tools/automated_ui_tests/java/src/* \
                ${BASE_DIR}/android_webview/tools/system_webview_shell/apk/src/* \
                ${BASE_DIR}/android_webview/tools/system_webview_shell/layout_tests/src/* \
                ${BASE_DIR}/android_webview/tools/system_webview_shell/page_cycler/src/* \
                ${BASE_DIR}/android_webview/unittestjava/src/* \
		"${APP_DIR}/src/main/java"

	mkdir -p ${MODULES_DIR}/android_webview/res
	mkdir -p ${MODULES_DIR}/android_webview/nonembedded_{res_devui,res_icon}
	mkdir -p ${MODULES_DIR}/android_webview/test_shell_res
	mkdir -p ${MODULES_DIR}/android_webview/automated_ui_tests_res
	mkdir -p ${MODULES_DIR}/android_webview/system_webview_shell_apk_res
	mkdir -p ${MODULES_DIR}/android_webview/webview_log_verbosifier_res

	cp -r ${BASE_DIR}/android_webview/java/res/* \
		"${MODULES_DIR}/android_webview/res"

	cp -r ${BASE_DIR}/android_webview/nonembedded/java/res_devui/* \
		"${MODULES_DIR}/android_webview/nonembedded_res_devui"

	cp -r ${BASE_DIR}/android_webview/nonembedded/java/res_icon/* \
		"${MODULES_DIR}/android_webview/nonembedded_res_icon"

	cp -r ${BASE_DIR}/android_webview/test/shell/res/* \
		"${MODULES_DIR}/android_webview/test_shell_res"

	cp -r ${BASE_DIR}/android_webview/tools/automated_ui_tests/java/res/* \
		"${MODULES_DIR}/android_webview/automated_ui_tests_res"

	cp -r ${BASE_DIR}/android_webview/tools/system_webview_shell/apk/res/* \
		"${MODULES_DIR}/android_webview/system_webview_shell_apk_res"

	cp -r ${BASE_DIR}/android_webview/tools/webview_log_verbosifier/res/* \
		"${MODULES_DIR}/android_webview/webview_log_verbosifier_res"
}

sync_features() {
	cp -r ${BASE_DIR}/chrome/android/features/autofill_assistant/java/src/* \
                ${BASE_DIR}/chrome/android/features/autofill_assistant/public/java/src/* \
                ${BASE_DIR}/chrome/android/features/dev_ui/java/src/* \
                ${BASE_DIR}/chrome/android/features/dev_ui/public/java/src/* \
                ${BASE_DIR}/chrome/android/features/keyboard_accessory/factory/java/src/* \
                ${BASE_DIR}/chrome/android/features/keyboard_accessory/internal/java/src/* \
                ${BASE_DIR}/chrome/android/features/keyboard_accessory/public/java/src/* \
                ${BASE_DIR}/chrome/android/features/media_router/java/src/* \
                ${BASE_DIR}/chrome/android/features/start_surface/internal/java/src/* \
                ${BASE_DIR}/chrome/android/features/start_surface/public/java/src/* \
                ${BASE_DIR}/chrome/android/features/tab_ui/java/src/* \
                ${BASE_DIR}/chrome/android/features/test_dummy/internal/java/src/* \
                ${BASE_DIR}/chrome/android/features/test_dummy/public/java/src/* \
                ${BASE_DIR}/chrome/android/features/vr/java/src/* \
		"${APP_DIR}/src/main/java"

	mkdir -p ${MODULES_DIR}/features/autofill_assistant/src/main/res
        mkdir -p ${MODULES_DIR}/features/autofill_assistant/src/main/res_poodle
        mkdir -p ${MODULES_DIR}/features/keyboard_accessory/src/main/res
        mkdir -p ${MODULES_DIR}/features/media_router/src/main/res
        mkdir -p ${MODULES_DIR}/features/start_surface/src/main/explore_res
        mkdir -p ${MODULES_DIR}/features/start_surface/src/main/res
        mkdir -p ${MODULES_DIR}/features/tab_ui/src/main/res
        mkdir -p ${MODULES_DIR}/features/vr/src/main/res

	cp -r ${BASE_DIR}/chrome/android/features/autofill_assistant/java/res/* \
		"${MODULES_DIR}/features/autofill_assistant/src/main/res"

	cp -r ${BASE_DIR}/chrome/android/features/autofill_assistant/java/res_poodle/* \
		"${MODULES_DIR}/features/autofill_assistant/src/main/res_poodle"

	cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/internal/java/res/* \
		"${MODULES_DIR}/features/keyboard_accessory/src/main/res"

	cp -r ${BASE_DIR}/chrome/android/features/media_router/java/res/* \
		"${MODULES_DIR}/features/media_router/src/main/res"

	cp -r ${BASE_DIR}/chrome/android/features/start_surface/internal/java/explore_res/* \
		"${MODULES_DIR}/features/start_surface/src/main/explore_res"

	cp -r ${BASE_DIR}/chrome/android/features/start_surface/internal/java/res/* \
		"${MODULES_DIR}/features/start_surface/src/main/res"

	cp -r ${BASE_DIR}/chrome/android/features/tab_ui/java/res/* \
		"${MODULES_DIR}/features/tab_ui/src/main/res"

	cp -r ${BASE_DIR}/chrome/android/features/vr/java/res/* \
		"${MODULES_DIR}/features/vr/src/main/res"
}

sync_feed() {
	cp -r ${BASE_DIR}/chrome/android/feed/core/java/src/* \
		"${APP_DIR}/src/main/java"

	mkdir -p ${MODULES_DIR}/feed/src/main/{res,library_basicstream_viewholders_res,library_basicstream_res,library_piet_res,library_sharedstream_menumeasurer_res,library_sharedstream_ui_res}

	cp -r ${BASE_DIR}/chrome/android/feed/core/java/res/* \
		"${MODULES_DIR}/feed/src/main/res"

	cp -r ${BASE_DIR}/chrome/android/feed/core/java/src/org/chromium/chrome/browser/feed/library/basicstream/internal/viewholders/res/* \
		"${MODULES_DIR}/feed/src/main/library_basicstream_viewholders_res"

	cp -r ${BASE_DIR}/chrome/android/feed/core/java/src/org/chromium/chrome/browser/feed/library/basicstream/res/* \
		"${MODULES_DIR}/feed/src/main/library_basicstream_res"

	cp -r ${BASE_DIR}/chrome/android/feed/core/java/src/org/chromium/chrome/browser/feed/library/piet/res/* \
		"${MODULES_DIR}/feed/src/main/library_piet_res"

	cp -r ${BASE_DIR}/chrome/android/feed/core/java/src/org/chromium/chrome/browser/feed/library/sharedstream/publicapi/menumeasurer/res/* \
		"${MODULES_DIR}/feed/src/main/library_sharedstream_menumeasurer_res"

	cp -r ${BASE_DIR}/chrome/android/feed/core/java/src/org/chromium/chrome/browser/feed/library/sharedstream/ui/res/* \
		"${MODULES_DIR}/feed/src/main/library_sharedstream_ui_res"
}

sync_components() {
	mkdir -p ${MODULES_DIR}/components/{autofill,embedder_support,browsertests_apk}/src/main/res
	mkdir -p ${MODULES_DIR}/components/cronet/src/main/{sample_res,test_res,smoketests_native,smoketests_platform_only}

	local components="${BASE_DIR}/components"
	cp -r ${components}/about_ui/android/java/src/* \
                ${components}/autofill/android/java/src/* \
                ${components}/background_task_scheduler/android/java/src/* \
                ${components}/bookmarks/common/android/java/src/* \
                ${components}/content_capture/android/java/src/* \
                ${components}/crash/android/java/src/* \
                ${components}/cronet/android/api/src/* \
                ${components}/cronet/android/fake/java/* \
                ${components}/cronet/android/fake/javatests/* \
                ${components}/cronet/android/java/src/* \
                ${components}/cronet/android/sample/src/* \
                ${components}/dom_distiller/content/browser/android/java/src/* \
                ${components}/dom_distiller/core/android/java/src/* \
                ${components}/download/internal/background_service/android/java/src/* \
                ${components}/download/internal/common/android/java/src/* \
                ${components}/download/network/android/java/src/* \
                ${components}/embedder_support/android/java/src/* \
                ${components}/feature_engagement/internal/android/java/src/* \
                ${components}/feature_engagement/public/android/java/src/* \
                ${components}/gcm_driver/android/java/src/* \
                ${components}/gcm_driver/instance_id/android/java/src/* \
                ${components}/invalidation/impl/android/java/src/* \
                ${components}/language/android/java/src/* \
                ${components}/location/android/java/src/* \
                ${components}/minidump_uploader/android/java/src/* \
                ${components}/module_installer/android/java/src/* \
                ${components}/navigation_interception/android/java/src/* \
                ${components}/offline_items_collection/core/android/java/src/* \
                ${components}/omnibox/browser/android/java/src/* \
                ${components}/paint_preview/player/android/java/src/* \
                ${components}/payments/content/android/java/src/* \
                ${components}/policy/android/java/src/* \
                ${components}/safe_browsing/android/java/src/* \
                ${components}/search_engines/android/java/src/* \
                ${components}/signin/core/browser/android/java/src/* \
                ${components}/signin/public/identity_manager/android/java/src/* \
                ${components}/spellcheck/browser/android/java/src/* \
                ${components}/sync/android/java/src/* \
                ${components}/url_formatter/android/java/src/* \
                ${components}/variations/android/java/src/* \
                ${components}/version_info/android/java/src/* \
                ${components}/viz/common/java/src/* \
                ${components}/viz/service/java/src/* \
		"${APP_DIR}/src/main/java"

	cp -r ${components}/autofill/android/java/res/* \
		"${MODULES_DIR}/components/autofill/src/main/res"
		
	cp -r ${components}/cronet/android/sample/res/* \
		"${MODULES_DIR}/components/cronet/src/main/sample_res"

	cp -r ${components}/cronet/android/test/res/* \
		"${MODULES_DIR}/components/cronet/src/main/test_res"

	cp -r ${components}/cronet/android/test/smoketests/res/native/* \
		"${MODULES_DIR}/components/cronet/src/main/smoketests_native"

	cp -r ${components}/cronet/android/test/smoketests/res/platform_only/* \
		"${MODULES_DIR}/components/cronet/src/main/smoketests_platform_only"

	cp -r ${components}/embedder_support/android/java/res/* \
		"${MODULES_DIR}/components/embedder_support/src/main/res"

	cp -r ${components}/test/android/browsertests_apk/res/* \
		"${MODULES_DIR}/components/browsertests_apk/src/main/res"
}

sync_content() {
	mkdir -p ${MODULES_DIR}/content/src/main/{base_res,res,shell_browsertests_apk_res,shell_res,shell_linker_test_apk_res,shell_apk_res}

	cp -r ${BASE_DIR}/content/public/android/java/src/* \
                ${BASE_DIR}/content/shell/android/browsertests/src/* \
                ${BASE_DIR}/content/shell/android/browsertests_apk/src/* \
                ${BASE_DIR}/content/shell/android/java/src/* \
                ${BASE_DIR}/content/shell/android/linker_test_apk/src/* \
                ${BASE_DIR}/content/shell/android/shell_apk/src/* \
		"${APP_DIR}/src/main/java"

	cp -r ${BASE_DIR}/content/public/android/java/strings \
		"${MODULES_DIR}/content/src/main/base_res"
	cp -r ${BASE_DIR}/content/public/android/java/res/* \
		"${MODULES_DIR}/content/src/main/res"
	cp -r ${BASE_DIR}/content/shell/android/browsertests_apk/res/* \
		"${MODULES_DIR}/content/src/main/shell_browsertests_apk_res"
	cp -r ${BASE_DIR}/content/shell/android/java/res/* \
		"${MODULES_DIR}/content/src/main/shell_res"
	cp -r ${BASE_DIR}/content/shell/android/linker_test_apk/res/* \
		"${MODULES_DIR}/content/src/main/shell_linker_test_apk_res"
	cp -r ${BASE_DIR}/content/shell/android/shell_apk/res/* \
		"${MODULES_DIR}/content/src/main/shell_apk_res"

	# local aidl_i="${APP_DIR}/src/main/aidl/org/chromium"
	# mkdir -p "$aidl_i"
	#
	# mv ${APP_DIR}/src/main/java/org/chromium/*.aidl "$aidl_i"
	#
	# local aidl_j="${APP_DIR}/src/main/aidl/org/chromium/content/common"
	# mkdir -p "$aidl_j"
	#
	# mv ${APP_DIR}/src/main/java/org/chromium/content/common/*.aidl "$aidl_j"

	# find ${APP_DIR}/src/main/java/org/chromium -name "*.aidl" -type f -print0 | xargs -0 rm -f
}

sync_media() {
	cp -r ${BASE_DIR}/media/base/android/java/src/* \
                ${BASE_DIR}/media/base/android/java/src/test/* \
                ${BASE_DIR}/media/capture/content/android/java/src/* \
                ${BASE_DIR}/media/capture/video/android/java/src/* \
                ${BASE_DIR}/media/midi/java/src/* \
                "${APP_DIR}/src/main/java"

        mkdir -p ${MODULES_DIR}/media/src/main/res

        cp -r ${BASE_DIR}/media/base/android/java/res/* \
        	"${MODULES_DIR}/media/src/main/res"
        
}

sync_browser() {
	cp -r ${BASE_DIR}/chrome/browser/android/thin_webview/internal/java/src/* \
                ${BASE_DIR}/chrome/browser/android/thin_webview/java/src/* \
                ${BASE_DIR}/chrome/browser/download/android/java/src/* \
                ${BASE_DIR}/chrome/browser/image_fetcher/android/java/src/* \
                ${BASE_DIR}/chrome/browser/notifications/chime/android/java/src/* \
                ${BASE_DIR}/chrome/browser/preferences/android/java/src/* \
                ${BASE_DIR}/chrome/browser/share/android/java/src/* \
                ${BASE_DIR}/chrome/browser/touch_to_fill/android/internal/java/src/* \
                ${BASE_DIR}/chrome/browser/touch_to_fill/android/java/src/* \
                ${BASE_DIR}/chrome/browser/ui/android/appmenu/internal/java/src/* \
                ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/src/* \
                ${BASE_DIR}/chrome/browser/ui/android/styles/java/src/* \
                ${BASE_DIR}/chrome/browser/ui/android/widget/java/src/* \
                ${BASE_DIR}/chrome/browser/util/android/java/src/* \
                "${APP_DIR}/src/main/java"

	mkdir -p ${MODULES_DIR}/browser/src/main/{share_res,touch_to_fill_res,ui_appmenu_res,ui_appmenu_internal_res,ui_appmenu_internal_test_res,ui_styles_res,ui_styles_res_night,ui_widget_res,ui_widget_test_res}

	cp -r ${BASE_DIR}/chrome/browser/share/android/java/res/* \
		"${MODULES_DIR}/browser/src/main/share_res"

        cp -r ${BASE_DIR}/chrome/browser/touch_to_fill/android/internal/java/res/* \
        	"${MODULES_DIR}/browser/src/main/touch_to_fill_res"

        cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/internal/java/res/* \
	        "${MODULES_DIR}/browser/src/main/ui_appmenu_res"

        cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/internal/test/java/res/* \
        	"${MODULES_DIR}/browser/src/main/ui_appmenu_test_res"

        cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/res/* \
        	"${MODULES_DIR}/browser/src/main/ui_appmenu_res"

        cp -r ${BASE_DIR}/chrome/browser/ui/android/styles/java/res/* \
        	"${MODULES_DIR}/browser/src/main/ui_styles_res"

        cp -r ${BASE_DIR}/chrome/browser/ui/android/styles/java/res_night/* \
        	"${MODULES_DIR}/browser/src/main/ui_styles_res_night"

        cp -r ${BASE_DIR}/chrome/browser/ui/android/widget/java/res/* \
        	"${MODULES_DIR}/browser/src/main/ui_widget_res"

        cp -r ${BASE_DIR}/chrome/browser/ui/android/widget/test/java/res/* \
        	"${MODULES_DIR}/browser/src/main/ui_widget_test_res"
}

sync_chrome() {
	mkdir -p ${APP_DIR}/{src/main/{java,res,aidl},src/test/res,libs}
	local source_dir="${APP_DIR}/src/main"
	local src_dir="${source_dir}/java"
	local res_dir="${source_dir}/res"
	
	cp "${BASE_DIR}/build/android/gradle/AndroidManifest.xml" \
		"${APP_DIR}/src/main"

	cp -r ${BASE_DIR}/base/android/java/src/* \
                ${BASE_DIR}/base/android/jni_generator/java/src/* \
                ${BASE_DIR}/build/android/buildhooks/java/* \
                ${BASE_DIR}/build/android/bytecode/java/* \
                ${BASE_DIR}/build/android/stacktrace/java/* \
                ${BASE_DIR}/chrome/android/java/src/* \
                ${BASE_DIR}/chrome/android/modules/chime/public/java/src/* \
                ${BASE_DIR}/chrome/android/modules/dev_ui/provider/java/src/* \
                ${BASE_DIR}/chrome/android/modules/extra_icu/provider/java/src/* \
                ${BASE_DIR}/chrome/android/modules/extra_icu/public/java/src/* \
                ${BASE_DIR}/chrome/android/modules/test_dummy/provider/java/src/* \
                ${BASE_DIR}/chrome/android/modules/test_dummy/public/java/src/* \
                ${BASE_DIR}/chrome/android/public/crypto/java/src/* \
                ${BASE_DIR}/chrome/android/public/profiles/java/src/* \
                ${BASE_DIR}/chrome/android/third_party/compositor_animator/java/src/* \
                ${BASE_DIR}/chrome/android/webapk/libs/client/src/* \
                ${BASE_DIR}/chrome/android/webapk/libs/common/src/* \
                ${BASE_DIR}/chrome/android/webapk/libs/runtime_library/src/* \
                ${BASE_DIR}/chrome/android/webapk/shell_apk/src/* \
                ${BASE_DIR}/chrome/lib/lifecycle/public/android/java/src/* \
		"${APP_DIR}/src/main/java"

	mkdir -p ${source_dir}/res_base

	cp -r ${BASE_DIR}/chrome/android/java/res/* \
	       "${source_dir}/res_base"

	cp -r  ${BASE_DIR}/chrome/android/java/res_chromium/* \
		"${res_dir}"

	cp -r ${BASE_DIR}/chrome/android/java/res_download/* \
		"${source_dir}/res_download"

	cp -r ${BASE_DIR}/chrome/android/java/res_night/* \
		"${source_dir}/res_night"

	cp -r ${BASE_DIR}/chrome/android/java/res_vr/* \
		"${source_dir}/res_vr"

	cp -r ${BASE_DIR}/chrome/android/javatests/res/* \
		"${source_dir}/javatests_res"

	cp -r ${BASE_DIR}/chrome/android/trichrome/res_dummy/* \
		"${source_dir}/trichrome_res_dummy"
	
	cp -r chrome/test/chromedriver/test/webview_shell/java/res/* \
		"${source_dir}/chromedriver_webview_shell_test_res"
		
	mkdir -p ${MODULES_DIR}/splash/src/main/{lib_common_res_splash,shell_apk_res}

	cp -r ${BASE_DIR}/chrome/android/webapk/libs/common/res_splash/* \
		"${MODULES_DIR}/webapk/src/main/lib_common_res_splash"

	cp -r ${BASE_DIR}/chrome/android/webapk/shell_apk/res/* \
		"${MODULES_DIR}/webapk/src/main/shell_apk_res"
}


sync_device() {
	cp -r ${BASE_DIR}/mojo/public/java/base/src/* \
                ${BASE_DIR}/mojo/public/java/bindings/src/* \
                ${BASE_DIR}/mojo/public/java/system/src/* \
               	"${APP_DIR}/src/main/java"
}

sync_mojo() {
	cp -r ${BASE_DIR}/device/bluetooth/android/java/src/* \
                ${BASE_DIR}/device/gamepad/android/java/src/* \
                ${BASE_DIR}/device/vr/android/java/src/* \
               	"${APP_DIR}/src/main/java"
}

sync_net() {
	cp -r ${BASE_DIR}/net/android/java/src/* \
               	"${APP_DIR}/src/main/java"

        mkdir -p ${MODULES_DIR}/net/src/main/unittest_support_res

	cp -r ${BASE_DIR}/net/android/unittest_support/res/* \
		"${MODULES_DIR}/feed/src/main/unittest_support_res"
}

sync_printing() {
	cp -r ${BASE_DIR}/printing/android/java/src/* \
               	"${APP_DIR}/src/main/java"
}

sync_remoting() {
	cp -r ${BASE_DIR}/remoting/android/apk/src/* \
                ${BASE_DIR}/remoting/android/java/src/* \
               	"${APP_DIR}/src/main/java"

        mkdir -p ${MODULES_DIR}/remoting/src/main/res

	cp -r ${BASE_DIR}/remoting/android/java/res/* \
		"${MODULES_DIR}/remoting/src/main/res"
}

sync_services() {
	cp -r ${BASE_DIR}/services/data_decoder/public/cpp/android/java/src/* \
                ${BASE_DIR}/services/device/android/java/src/* \
                ${BASE_DIR}/services/device/battery/android/java/src/* \
                ${BASE_DIR}/services/device/generic_sensor/android/java/src/* \
                ${BASE_DIR}/services/device/geolocation/android/java/src/* \
                ${BASE_DIR}/services/device/nfc/android/java/src/* \
                ${BASE_DIR}/services/device/public/java/src/* \
                ${BASE_DIR}/services/device/screen_orientation/android/java/src/* \
                ${BASE_DIR}/services/device/time_zone_monitor/android/java/src/* \
                ${BASE_DIR}/services/device/usb/android/java/src/* \
                ${BASE_DIR}/services/device/vibration/android/java/src/* \
                ${BASE_DIR}/services/device/wake_lock/power_save_blocker/android/java/src/* \
                ${BASE_DIR}/services/media_session/public/cpp/android/java/src/* \
                ${BASE_DIR}/services/service_manager/public/java/src/* \
                ${BASE_DIR}/services/shape_detection/android/java/src/* \
               	"${APP_DIR}/src/main/java"

        mkdir -p ${MODULES_DIR}/remoting/src/main/res

	cp -r ${BASE_DIR}/remoting/android/java/res/* \
		"${MODULES_DIR}/remoting/src/main/res"
}

sync_third_party() {
	cp -r ${BASE_DIR}/third_party/android_data_chart/java/src/* \
                ${BASE_DIR}/third_party/android_media/java/src/* \
                ${BASE_DIR}/third_party/android_protobuf/src/java/src/device/main/java/* \
                ${BASE_DIR}/third_party/android_protobuf/src/java/src/main/java/* \
                ${BASE_DIR}/third_party/android_sdk/androidx_browser/src/browser/src/main/java/* \
                ${BASE_DIR}/third_party/android_sdk/public/extras/chromium/support/src/* \
                ${BASE_DIR}/third_party/android_swipe_refresh/java/src/* \
                ${BASE_DIR}/third_party/cacheinvalidation/src/java/* \
                ${BASE_DIR}/third_party/cct_dynamic_module/src/src/java/* \
                ${BASE_DIR}/third_party/custom_tabs_client/src/Application/src/main/java/* \
                ${BASE_DIR}/third_party/custom_tabs_client/src/customtabs/src/* \
                ${BASE_DIR}/third_party/custom_tabs_client/src/shared/src/main/java/* \
                ${BASE_DIR}/third_party/gif_player/src/* \
                ${BASE_DIR}/third_party/jsr-305/src/ri/src/main/java/* \
                ${BASE_DIR}/third_party/mockito/src/src/main/java/* \
                ${BASE_DIR}/third_party/mockito/src/subprojects/android/src/main/java/* \
                ${BASE_DIR}/third_party/robolectric/custom_asynctask/java/src/* \
                ${BASE_DIR}/third_party/robolectric/robolectric/annotations/src/main/java/* \
                ${BASE_DIR}/third_party/robolectric/robolectric/resources/src/main/java/* \
                ${BASE_DIR}/third_party/robolectric/robolectric/sandbox/src/main/java/* \
                ${BASE_DIR}/third_party/robolectric/robolectric/shadowapi/src/main/java/* \
                ${BASE_DIR}/third_party/robolectric/robolectric/utils/src/main/java/* \
               	"${APP_DIR}/src/main/java"

        mkdir -p ${MODULES_DIR}/third_party/{android_data_chart,android_media}/src/main/res
        mkdir -p ${MODULES_DIR}/third_party/custom_tabs_client/src/main/{application_res,customtabs_res}

	cp -r ${BASE_DIR}/third_party/android_data_chart/java/res/* \
		"${MODULES_DIR}/third_party/android_data_chart/src/main/res"

	cp -r ${BASE_DIR}/third_party/android_media/java/res/* \
		"${MODULES_DIR}/third_party/android_media/src/main/res"

	cp -r ${BASE_DIR}/third_party/custom_tabs_client/src/Application/src/main/res/* \
		"${MODULES_DIR}/third_party/custom_tabs_client/src/main/application_res"

	cp -r ${BASE_DIR}/third_party/custom_tabs_client/src/customtabs/res/* \
		"${MODULES_DIR}/third_party/custom_tabs_client/src/main/customtabs_res"
}

sync_tools() {
	cp -r ${BASE_DIR}/tools/android/audio_focus_grabber/java/src/* \
                ${BASE_DIR}/tools/android/customtabs_benchmark/java/src/* \
                ${BASE_DIR}/tools/android/errorprone_plugin/src/* \
                ${BASE_DIR}/tools/android/kerberos/SpnegoAuthenticator/src/* \
                ${BASE_DIR}/tools/android/memconsumer/java/src/* \
                ${BASE_DIR}/tools/android/push_apps_to_background/src/* \
               	"${APP_DIR}/src/main/java"

        mkdir -p ${MODULES_DIR}/tools/src/main/{mainandroid_data_chart_res,customtabs_benchmark_res,SpnegoAuthenticator_res,memconsumer_res,push_apps_to_background_res}

	cp -r ${BASE_DIR}/tools/android/audio_focus_grabber/java/res/* \
		"${MODULES_DIR}/tools/src/main/mainandroid_data_chart_res"

	cp -r ${BASE_DIR}/tools/android/customtabs_benchmark/res/* \
		"${MODULES_DIR}/tools/src/main/customtabs_benchmark_res"

	cp -r ${BASE_DIR}/tools/android/kerberos/SpnegoAuthenticator/res/* \
		"${MODULES_DIR}/tools/src/main/SpnegoAuthenticator_res"

	cp -r ${BASE_DIR}/tools/android/memconsumer/java/res/* \
		"${MODULES_DIR}/tools/src/main/memconsumer_res"

	cp -r ${BASE_DIR}/tools/android/push_apps_to_background/res* \
		"${MODULES_DIR}/tools/src/main/push_apps_to_background_res"
}

sync_ui() {
	cp -r ${BASE_DIR}/ui/android/java/src/* \
		"${APP_DIR}/src/main/java"

	mkdir -p ${MODULES_DIR}/ui/src/main/{base_res,res,res_night}

	cp -r ${BASE_DIR}/ui/android/java/strings \
		"${MODULES_DIR}/ui/src/main/base_res"

	cp -r ${BASE_DIR}/ui/android/java/res/* \
		"${MODULES_DIR}/ui/src/main/res"

	cp -r ${BASE_DIR}/ui/android/java/res_night/* \
		"${MODULES_DIR}/ui/src/main/res_night"
}

sync_url() {
	cp -r ${BASE_DIR}/url/android/java/src/* \
               	"${APP_DIR}/src/main/java"
}

sync_webplayer() {
	cp -r ${BASE_DIR}/weblayer/browser/java/* \
                ${BASE_DIR}/weblayer/public/java/* \
                ${BASE_DIR}/weblayer/public/javatests/* \
                ${BASE_DIR}/weblayer/shell/android/browsertests_apk/src/* \
                ${BASE_DIR}/weblayer/shell/android/shell_apk/src/* \
               	"${APP_DIR}/src/main/java"

        mkdir -p ${MODULES_DIR}/webplayer/src/main/res

	cp -r ${BASE_DIR}/weblayer/public/java/res/* \
		"${MODULES_DIR}/weblayer/src/main/res"
}

sync_gen() {
	cp -r ${RELEASE_DIR}/gen/android_webview/android_webview_product_config_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/browser_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/common_aidl_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/common_commandline_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/common_crash_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/common_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/common_platform_services_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/common_variations_utils_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/glue/glue/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/nonembedded/devui_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/nonembedded/nonembedded_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/nonembedded/services_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/platform_service_bridge_upstream_implementation_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/proto/aw_variations_seed_proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/support_library/boundary_interfaces/boundary_interface_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/support_library/callback/callback_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/support_library/support_lib_glue_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/system_webview_apk/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/tools/automated_ui_tests/webview_ui_test_app_apk/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/tools/automated_ui_tests/webview_ui_test_app_java/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/tools/automated_ui_tests/webview_ui_test_app_test_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/tools/system_webview_shell/system_webview_shell_apk/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/tools/system_webview_shell/system_webview_shell_layout_test_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/tools/system_webview_shell/system_webview_shell_page_cycler_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/tools/webview_log_verbosifier/webview_log_verbosifier_apk/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/trichrome_webview_64_32_apk/generated_java/* \
                ${RELEASE_DIR}/gen/android_webview/trichrome_webview_apk/generated_java/* \
                ${RELEASE_DIR}/gen/base/android/jni_generator/jni_processor/generated_java/* \
                ${RELEASE_DIR}/gen/base/android/jni_generator/jni_sample_java/generated_java/* \
                ${RELEASE_DIR}/gen/base/android/jni_generator/sample_jni_apk/generated_java/* \
                ${RELEASE_DIR}/gen/base/base_i18n_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/base/base_java/generated_java/* \
                ${RELEASE_DIR}/gen/base/base_java_process_launcher_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/base/base_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/base/base_java_unittest_support/generated_java/* \
                ${RELEASE_DIR}/gen/base/base_junit_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/base/base_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/base/base_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/base/base_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/base/jni_java/generated_java/* \
                ${RELEASE_DIR}/gen/base/util/base_util_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/build/android/buildhooks/build_hooks_android_impl_java/generated_java/* \
                ${RELEASE_DIR}/gen/build/android/buildhooks/build_hooks_android_java/generated_java/* \
                ${RELEASE_DIR}/gen/build/android/buildhooks/build_hooks_java/generated_java/* \
                ${RELEASE_DIR}/gen/build/android/bytecode/java_bytecode_rewriter/generated_java/* \
                ${RELEASE_DIR}/gen/build/android/stacktrace/java_deobfuscate/generated_java/* \
                ${RELEASE_DIR}/gen/cc/cc_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/cc/cc_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/cc/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/app_hooks_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/browser_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_bundle_smoke_test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_modern_public_apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_public_apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_public_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_public_test_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_public_test_vr_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_smoke_test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_test_ar_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_test_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_test_util_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_test_vr_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/chrome_test_xr_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/autofill_assistant/animated_poodle_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/autofill_assistant/autofill_assistant_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/autofill_assistant/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/autofill_assistant/test_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/dev_ui/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/dev_ui/public/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/factory/internal_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/factory/public_java/chrome/android/features/keyboard_accessory/factory/java/src/* \
                ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/factory/public_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/internal/internal_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/keyboard_accessory_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/public/public_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/test_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/media_router/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/media_router/media_router_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/media_router/test_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/start_surface/internal/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/tab_ui/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/tab_ui/module_desc_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/test_dummy/internal/base_module_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/test_dummy/public/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/features/vr/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/feed/core/java/src/org/chromium/chrome/browser/feed/library/feed_conformance_test_lib_android_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/feed/core/java/src/org/chromium/chrome/browser/feed/library/feed_lib_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/modules/chime/public/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/modules/dev_ui/provider/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/modules/extra_icu/provider/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/modules/extra_icu/public/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/modules/test_dummy/provider/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/modules/test_dummy/public/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/monochrome_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/monochrome_public_apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/monochrome_public_test_ar_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/partner_location_descriptor_proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/public/crypto/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/public/profiles/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/templates/* \
                ${RELEASE_DIR}/gen/chrome/android/third_party/compositor_animator/compositor_animator_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/thumbnail_cache_entry_proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/trichrome_library_64_32_apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/trichrome_library_apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/update_proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/usage_stats_proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/vr_nfc_simulator_apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/vr_test_module_desc_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/libs/client/client_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/libs/client/webapk_client_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/libs/common/common_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/libs/common/splash_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/libs/runtime_library/runtime_library_for_tests_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/libs/runtime_library/webapk_service_aidl_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/compiled_in_runtime_library_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/h2o_j_unit_webapk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/h2o_j_unit_webapk_generated_webapk_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/h2o_j_unit_webapk_generated_webapk_with_service_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/javatests_webapk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/javatests_webapk_generated_webapk_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/javatests_webapk_generated_webapk_with_service_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/maps_go_webapk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/maps_go_webapk_generated_webapk_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/maps_go_webapk_generated_webapk_with_service_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/new_splash_webapk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/new_splash_webapk_generated_webapk_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/new_splash_webapk_generated_webapk_with_service_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/unbound_webapk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/unbound_webapk_generated_webapk_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/unbound_webapk_generated_webapk_with_service_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/webapk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/webapk_generated_webapk_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/webapk_generated_webapk_with_service_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/webapk_shell_apk_h2o_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/webapk_shell_apk_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/android/metrics/ukm_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/android/thin_webview/factory_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/android/thin_webview/internal/internal_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/android/thin_webview/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/android/vr/ar_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/android/vr/vr_android_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/download/android/download_java_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/download/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/image_fetcher/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/notifications/chime/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/preferences/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/preferences/preferences_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/subresource_filter/subresource_filter_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/touch_to_fill/android/internal/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/touch_to_fill/android/public_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/touch_to_fill/android/test_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/touch_to_fill/android/touch_to_fill_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/ui/android/appmenu/factory_java/chrome/browser/ui/android/appmenu/java/src/* \
                ${RELEASE_DIR}/gen/chrome/browser/ui/android/appmenu/factory_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/ui/android/appmenu/internal/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/ui/android/appmenu/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/ui/android/appmenu/test_support_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/ui/android/styles/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/ui/android/widget/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/ui/android/widget/test_support_java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/ui/android/widget/ui_widget_java_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/ui/android/widget/ui_widget_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/util/java/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/vr/vr_common_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/vr/vr_common_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/browser/vr/vr_pixeltests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/chrome/lib/lifecycle/public/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/components/about_ui/android/aboutui_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/autofill/android/autofill_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/autofill/android/provider_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/autofill/core/common/mojom/mojo_types_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/autofill_assistant/browser/proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/background_task_scheduler/background_task_scheduler_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/background_task_scheduler/background_task_scheduler_task_ids_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/background_task_scheduler/components_background_task_scheduler_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/components/background_task_scheduler/scheduled_task_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/bookmarks/common/android/bookmarks_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/components_browsertests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/components_browsertests_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/components_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/components_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/content_capture/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/components/content_settings/core/common/mojo_bindings_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/contextual_search/content/common/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/crash/android/handler_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/crash/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_api_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_impl_common_base_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_impl_fake_base_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_impl_java_util_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_impl_native_base_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_impl_platform_base_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_perf_test_apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_sample_apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_sample_apk_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_sample_test_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_smoketests_missing_native_library_instrumentation_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_smoketests_platform_only_instrumentation_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_test_apk_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_test_instrumentation_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_tests_android__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_unittests_android__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/cronet_urlconnection_impl_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/cronet/android/templates/* \
                ${RELEASE_DIR}/gen/components/dom_distiller/content/browser/android/dom_distiller_content_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/dom_distiller/core/android/dom_distiller_core_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/download/internal/background_service/internal_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/download/internal/common/internal_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/download/network/network_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/download/public/common/public_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/download/public/task/public_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/embedder_support/android/application_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/embedder_support/android/content_view_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/embedder_support/android/view_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/embedder_support/android/web_contents_delegate_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/feature_engagement/internal/internal_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/feature_engagement/public/public_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/feed/core/proto/proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/gcm_driver/android/components_gcm_driver_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/components/gcm_driver/android/gcm_driver_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/gcm_driver/instance_id/android/instance_id_driver_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/gcm_driver/instance_id/android/instance_id_driver_test_support_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/gwp_asan/gwp_asan_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/heap_profiling/heap_profiling_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/components/invalidation/impl/components_invalidation_impl_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/components/invalidation/impl/java/generated_java/* \
                ${RELEASE_DIR}/gen/components/invalidation/impl/proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/language/android/language_bridge_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/location/android/location_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/metrics/metrics_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/metrics/metrics_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/minidump_uploader/minidump_uploader_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/mirroring/mirroring_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/module_installer/android/module_installer_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/module_installer/android/module_installer_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/components/module_installer/android/module_interface_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/navigation_interception/android/navigation_interception_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/offline_items_collection/core/core_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/offline_pages/core/prefetch/offline_prefetch_proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/offline_pages/offline_pages_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/omnibox/browser/browser_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/paint_preview/browser/paint_preview_browser_unit_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/paint_preview/common/paint_preview_common_unit_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/paint_preview/player/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/components/paint_preview/player/android/paint_preview_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/components/paint_preview/renderer/paint_preview_renderer_unit_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/payments/content/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/components/payments/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/policy/android/components_policy_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/components/policy/android/policy_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/policy/android/policy_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/components/rappor/rappor_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/safe_browsing/android/safe_browsing_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/search_engines/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/components/services/filesystem/filesystem_service_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/services/filesystem/public/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/services/paint_preview_compositor/paint_preview_compositor_unit_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/signin/core/browser/android/components_signin_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/components/signin/core/browser/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/components/signin/core/browser/android/signin_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/components/signin/public/identity_manager/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/components/spellcheck/browser/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/components/sync/android/sync_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/sync/protocol/protocol_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/sync/sync_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/components/tracing/tracing_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/ukm/ukm_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/url_formatter/android/url_formatter_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/variations/android/components_variations_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/components/variations/android/variations_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/variations/load_seed_result_enum_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/variations/variations_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/version_info/android/java/* \
                ${RELEASE_DIR}/gen/components/version_info/android/version_constants_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/viz/common/common_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/viz/common/viz_benchmark__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/viz/service/service_java/generated_java/* \
                ${RELEASE_DIR}/gen/components/viz/viz_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/components/viz/viz_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/content/public/android/content_java/generated_java/* \
                ${RELEASE_DIR}/gen/content/public/android/content_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/content/shell/android/chromium_linker_test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/content/shell/android/content_shell_apk/generated_java/* \
                ${RELEASE_DIR}/gen/content/shell/android/content_shell_apk_java/generated_java/* \
                ${RELEASE_DIR}/gen/content/shell/android/content_shell_browsertests_java/generated_java/* \
                ${RELEASE_DIR}/gen/content/shell/android/content_shell_java/generated_java/* \
                ${RELEASE_DIR}/gen/content/shell/android/content_shell_test_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/content/shell/android/content_shell_test_java/generated_java/* \
                ${RELEASE_DIR}/gen/courgette/courgette_fuzz__apk/generated_java/* \
                ${RELEASE_DIR}/gen/courgette/courgette_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/crypto/crypto_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/device/bluetooth/java/generated_java/* \
                ${RELEASE_DIR}/gen/device/bluetooth_test_java/generated_java/* \
                ${RELEASE_DIR}/gen/device/device_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/device/device_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/device/gamepad/java/generated_java/* \
                ${RELEASE_DIR}/gen/device/vr/java/generated_java/* \
                ${RELEASE_DIR}/gen/gin/gin_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/google_apis/gcm/gcm_unit_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/google_apis/google_apis_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/gpu/command_buffer_gles2_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/gpu/command_buffer_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/gpu/gl_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/gpu/gpu_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/gpu/gpu_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/gpu/ipc/common/gpu_preferences_interface_java/generated_java/* \
                ${RELEASE_DIR}/gen/gpu/ipc/common/interfaces_java/generated_java/* \
                ${RELEASE_DIR}/gen/gpu/ipc/common/vulkan_interface_java/generated_java/* \
                ${RELEASE_DIR}/gen/gpu/vulkan/android/vk_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ipc/ipc_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ipc/ipc_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/jingle/jingle_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/audio_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/base/android/media_base_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/media/base/android/media_java/generated_java/* \
                ${RELEASE_DIR}/gen/media/blink/media_blink_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/capture/capture_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/capture/content/android/screen_capture_java/generated_java/* \
                ${RELEASE_DIR}/gen/media/capture/mojom/video_capture_java/generated_java/* \
                ${RELEASE_DIR}/gen/media/capture/video/android/capture_java/generated_java/* \
                ${RELEASE_DIR}/gen/media/cast/cast_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/gpu/video_decode_accelerator_unittest__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/learning/mojo/media_learning_mojo_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/learning/mojo/public/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/media/media_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/media_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/midi/midi_java/generated_java/* \
                ${RELEASE_DIR}/gen/media/midi/midi_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/mojo/media_mojo_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/mojo/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/media/mojo/services/media_service_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/media/remoting/media_remoting_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/mojo_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/mojo_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/interfaces/bindings/tests/echo_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/interfaces/bindings/tests/test_deserializer_interface_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/interfaces/bindings/tests/test_interfaces_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/interfaces/bindings/tests/test_mojom_import2_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/interfaces/bindings/tests/test_mojom_import_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/interfaces/bindings/tests/test_mojom_import_wrapper_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/interfaces/bindings/tests/test_mojom_import_wrapper_wrapper_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/java/base_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/java/bindings_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/java/system/mojo_test_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/java/system/system_impl_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/java/system/test_support_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/java/system_java/generated_java/* \
                ${RELEASE_DIR}/gen/mojo/public/mojom/base/base_java/generated_java/* \
                ${RELEASE_DIR}/gen/net/android/embedded_test_server_aidl_java/generated_java/* \
                ${RELEASE_DIR}/gen/net/android/net_java/generated_java/* \
                ${RELEASE_DIR}/gen/net/android/net_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/net/android/net_java_test_support_provider/generated_java/* \
                ${RELEASE_DIR}/gen/net/android/net_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/net/android/net_test_support_apk/generated_java/* \
                ${RELEASE_DIR}/gen/net/android/net_thread_stats_uid_java/generated_java/* \
                ${RELEASE_DIR}/gen/net/net_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/net/net_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/printing/printing_java/generated_java/* \
                ${RELEASE_DIR}/gen/printing/printing_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/remoting/android/remoting_android_client_java/generated_java/* \
                ${RELEASE_DIR}/gen/remoting/android/remoting_apk/generated_java/* \
                ${RELEASE_DIR}/gen/remoting/android/remoting_test_apk__test_apk__apk/generated_java/* \
                ${RELEASE_DIR}/gen/remoting/proto/remoting/v1/directory_proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/remoting/remoting_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/services/data_decoder/public/cpp/android/safe_json_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/battery/android/battery_monitor_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/generic_sensor/java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/geolocation/geolocation_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/nfc/android/java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/public/java/geolocation_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/public/java/geolocation_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/public/java/nfc_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/public/mojom/constants_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/public/mojom/generic_sensor_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/public/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/public/mojom/usb_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/screen_orientation/java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/time_zone_monitor/java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/usb/java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/vibration/android/vibration_manager_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/device/wake_lock/power_save_blocker/java/generated_java/* \
                ${RELEASE_DIR}/gen/services/media_session/public/cpp/android/media_session_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/media_session/public/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/network/public/mojom/data_pipe_interfaces_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_ip_address_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_network_isolation_key_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/network/public/mojom/mutable_network_traffic_annotation_interface_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/network/public/mojom/websocket_mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/proxy_resolver/public/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/service_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/services/service_manager/public/java/service_manager_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/service_manager/public/mojom/constants_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/service_manager/public/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/service_manager/tests/service_manager_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/services/services_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/services/services_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/services/shape_detection/public/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/shape_detection/shape_detection_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/tracing/tracing_test_helper_java/generated_java/* \
                ${RELEASE_DIR}/gen/services/viz/public/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/skia/public/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/skia/skia_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/sql/sql_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/storage/storage_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/SPIRV-Tools/src/spvtools_test__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/android_data_chart/android_data_chart_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/android_media/android_media_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/android_protobuf/protobuf_nano_javalib/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/android_sdk/android_support_chromium_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/android_sdk/androidx_browser/androidx_browser_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/android_swipe_refresh/android_swipe_refresh_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/angle/angle_chromium_apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/angle/src/tests/angle_end2end_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/angle/src/tests/angle_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/angle/src/tests/angle_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/angle/src/tests/angle_white_box_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/angle/src/tests/angle_white_box_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/common/blink_common_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/public/blink_headers_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/public/mojom/android_mojo_bindings_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/public/mojom/authenticator_test_mojo_bindings_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/public/mojom/dom_storage/dom_storage_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/public/mojom/mojom_core_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/public/mojom/mojom_mhtml_load_result_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/public/mojom/mojom_platform_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/public/mojom/usb/usb_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_client_hints_types_mojo_bindings_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_feature_mojo_bindings_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/renderer/controller/blink_perf_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/renderer/controller/blink_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/renderer/platform/blink_fuzzer_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/renderer/platform/blink_platform_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/renderer/platform/blink_platform_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/renderer/platform/heap/blink_heap_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/blink/renderer/platform/wtf/wtf_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/boringssl/boringssl_crypto_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/boringssl/boringssl_ssl_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/cacheinvalidation/cacheinvalidation_javalib/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/cacheinvalidation/cacheinvalidation_proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/cacheinvalidation/cacheinvalidation_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/catapult/devil/empty_system_webview_apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/cct_dynamic_module/cct_dynamic_module_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/ced/ced_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/crashpad/crashpad/crashpad_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/crc32c/crc32c_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/custom_tabs_client/custom_tabs_client_example_apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/custom_tabs_client/custom_tabs_client_shared_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/custom_tabs_client/custom_tabs_support_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/flatbuffers/flatbuffers_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/gif_player/gif_player_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/gvr-android-keyboard/kb_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/jsr-305/jsr_305_javalib/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/libaddressinput/libaddressinput_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/libjingle_xmpp/libjingle_xmpp_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/libphonenumber/libphonenumber_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/metrics_proto/metrics_proto_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/mockito/mockito_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/one_euro_filter/one_euro_filter_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/opus/opus_tests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/opus/test_opus_api__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/opus/test_opus_decode__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/opus/test_opus_encode__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/opus/test_opus_padding__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/perfetto/perfetto_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/pffft/pffft_unittest__apk/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/robolectric/robolectric_annotations_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/robolectric/robolectric_junit_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/robolectric/robolectric_resources_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/robolectric/robolectric_sandbox_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/robolectric/robolectric_shadowapi_java/generated_java/* \
                ${RELEASE_DIR}/gen/third_party/robolectric/robolectric_utils_java/generated_java/* \
                ${RELEASE_DIR}/gen/tools/android/audio_focus_grabber/audio_focus_grabber_apk/generated_java/* \
                ${RELEASE_DIR}/gen/tools/android/customtabs_benchmark/customtabs_benchmark_apk/generated_java/* \
                ${RELEASE_DIR}/gen/tools/android/errorprone_plugin/errorprone_plugin_java/generated_java/* \
                ${RELEASE_DIR}/gen/tools/android/kerberos/SpnegoAuthenticator/spnego_authenticator_apk/generated_java/* \
                ${RELEASE_DIR}/gen/tools/android/memconsumer/memconsumer_apk/generated_java/* \
                ${RELEASE_DIR}/gen/tools/android/push_apps_to_background/push_apps_to_background_apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/accessibility/accessibility_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/accessibility/accessibility_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/android/ui_android_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/android/ui_full_java/generated_java/* \
                ${RELEASE_DIR}/gen/ui/android/ui_java_test_support/generated_java/* \
                ${RELEASE_DIR}/gen/ui/android/ui_junit_tests/generated_java/* \
                ${RELEASE_DIR}/gen/ui/android/ui_utils_java/generated_java/* \
                ${RELEASE_DIR}/gen/ui/base/ime/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/ui/base/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/ui/base/ui_base_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/color/color_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/compositor/compositor_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/display/display_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/display/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/ui/events/events_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/gfx/geometry/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/ui/gfx/gfx_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/gfx/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/ui/gl/gl_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/latency/latency_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/latency/latency_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/latency/mojom/mojom_java/generated_java/* \
                ${RELEASE_DIR}/gen/ui/native_theme/native_theme_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/shell_dialogs/shell_dialogs_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/snapshot/snapshot_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/ui/touch_selection/ui_touch_selection_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/url/ipc/url_ipc_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/url/mojom/url_mojom_gurl_java/generated_java/* \
                ${RELEASE_DIR}/gen/url/mojom/url_mojom_origin_java/generated_java/* \
                ${RELEASE_DIR}/gen/url/origin_java/generated_java/* \
                ${RELEASE_DIR}/gen/url/url_java/generated_java/* \
                ${RELEASE_DIR}/gen/url/url_perftests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/url/url_unittests__apk/generated_java/* \
                ${RELEASE_DIR}/gen/weblayer/browser/java/gms_bridge_java/generated_java/* \
                ${RELEASE_DIR}/gen/weblayer/browser/java/gms_bridge_upstream_impl_java/generated_java/* \
                ${RELEASE_DIR}/gen/weblayer/browser/java/interfaces_java/generated_java/* \
                ${RELEASE_DIR}/gen/weblayer/browser/java/java/generated_java/* \
                ${RELEASE_DIR}/gen/weblayer/public/java/* \
                ${RELEASE_DIR}/gen/weblayer/public/java/java/generated_java/* \
                ${RELEASE_DIR}/gen/weblayer/shell/android/weblayer_shell_apk/generated_java/* \
                ${RELEASE_DIR}/gen/weblayer/shell/android/weblayer_shell_java/generated_java/* \
                ${RELEASE_DIR}/gen/weblayer/shell/android/weblayer_shell_system_webview_apk/generated_java/* \
                ${RELEASE_DIR}/gen/weblayer/shell/android/weblayer_support_apk/generated_java/* \
                "${APP_DIR}/src/main/java"

	mkdir -p ${MODULES_DIR}/gen/src/main/res

	cp -r ${RELEASE_DIR}/gen/chrome/android/templates/chrome_version_xml/res/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/h2o_j_unit_webapk_generate_res_background_xml/res/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/javatests_webapk_generate_res_background_xml/res/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/maps_go_webapk_generate_res_background_xml/res/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/new_splash_webapk_generate_res_background_xml/res/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/unbound_webapk_generate_res_background_xml/res/* \
                ${RELEASE_DIR}/gen/chrome/android/webapk/shell_apk/webapk_generate_res_background_xml/res/* \
                ${RELEASE_DIR}/gen/chrome/app/policy/android/* \
                ${RELEASE_DIR}/gen/remoting/android/credits_resources_raw/res/* \
                ${RELEASE_DIR}/obj/third_party/android_deps/com_android_support_design_java/res/* \
                ${RELEASE_DIR}/obj/third_party/android_deps/com_android_support_gridlayout_v7_java/res/* \
                ${RELEASE_DIR}/obj/third_party/android_deps/com_android_support_preference_v7_java/res/* \
                ${RELEASE_DIR}/obj/third_party/android_deps/com_android_support_transition_java/res/* \
                "${MODULES_DIR}/gen/src/main/res"
}

sync_aidl() {
        local custom_tabs_aidl="${APP_DIR}/src/main/aidl/android/support/customtabs"
        mkdir -p "$custom_tabs_aidl"
        mv -f ${APP_DIR}/src/main/java/android/support/customtabs/*.aidl \
		"$custom_tabs_aidl"

        local custom_tabs_trusted_aidl="${APP_DIR}/src/main/aidl/android/support/customtabs/trusted"
        mkdir -p "$custom_tabs_trusted_aidl"
        mv -f ${APP_DIR}/src/main/java/android/support/customtabs/trusted/*.aidl \
                "$custom_tabs_trusted_aidl"
}


sync_assets() {
	local asset_dir="${APP_DIR}/src/main/assets"

	mkdir -p "${asset_dir}/locales"

	cp ${RELEASE_DIR}/*.dat \
		${RELEASE_DIR}/gen/chrome/android/chrome_apk_paks/*.pak \
		"$asset_dir"

	cp ${RELEASE_DIR}/gen/chrome/android/chrome_apk_paks/locales/* \
		"${asset_dir}/locales"
	cp ${RELEASE_DIR}/snapshot_blob.bin "$asset_dir"/snapshot_blob_32.bin
}

sync_libs() {
	mkdir -p "${APP_DIR}/libs"

	cp ${BASE_DIR}/third_party/google_android_play_core/*.aar \
		${RELEASE_DIR}/lib.java/third_party/android_sdk/gcm.jar \
		"${APP_DIR}/libs"
}

sync_jniLibs() {
	local jni_libs_dir="${APP_DIR}/src/main/jniLibs/x64"
	mkdir -p "$jni_libs_dir"
	cp ${RELEASE_DIR}/*.so "$jni_libs_dir"
}

clean_project() {
	rm -rf ${APP_DIR}/src/main/java/org/org \
		${APP_DIR}/src/main/java/org/src \
		${APP_DIR}/src/main/java/org/com \
		${APP_DIR}/src/main/java/com/google/protobuf \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/MonochromeApplication.java \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/preferences/password/PasswordEntryEditorPreference.java \
		${APP_DIR}/src/main/java/org/chromium/components/embedder_support/media \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/offlinepages/evaluation \
		${APP_DIR}/src/main/java/{src,test,templates}

	local feed_dir="${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library"
	find "$feed_dir" -regextype "posix-egrep" -regex ".*/(testing|test_data|res)" -type d -print0 | \
		xargs -0 rm -rf

	find "$feed_dir" -regextype "posix-egrep" -regex ".*/AndroidManifest.xml" -type f -print0 | \
		xargs -0 rm -f

	local del_files="README|OWNERS|COPYING|BUILD|.*\.template|R\.java|.*\.stamp|.*stamp\.d|.*\.py|.*\.flags"
	find "$PRO_DIR" -regextype "posix-egrep" -regex ".*/(${del_files})" -type f -print0 | \
		xargs -0 rm -f

	local langs="am|ar|bg|ca|cs|da|de|el|en-rGB|es|es-rUS|fa|fi|fr|hi|hr|hu|in|it|iw"
	langs="$langs|ja|ko|lt|lv|nb|nl|pl|pt-rBR|pt-rPT|ro|ru|sk|sl|sr|sv|sw|th|tl|tr|uk|vi"
	find "$PRO_DIR" -regextype "posix-egrep" -regex ".*values-($langs)" -print0 | xargs -0 rm -rf

	find "${PRO_DIR}/res_base" -regextype "posix-egrep" -regex ".*/app_icon\.png" -type f -print0 | xargs -0 rm -f

	local aidls
	aidls=$(find "${APP_DIR}/src/main/aidl" -name "*.aidl" -type f)
	local j_file;
	for aidl in $aidls; do
		j_file="$(basename "$aidl" ".aidl")"
		find "${APP_DIR}/src/main/java" -name "${j_file}.java" -type f -print0 | xargs -0 rm -f
	done

	local empty_dirs;
	while :; do
		empty_dirs="$(find "$PRO_DIR" -type d -empty)"
		if [ -n "$empty_dirs" ]; then
			echo "$empty_dirs" | xargs rm -rf
		else
			break
		fi
	done
}

do_sync() {
	rm -rf "$PRO_DIR"
	mkdir -p ${APP_DIR}/src/main/{java,res}
	sync_android_webview
	sync_features
	sync_feed
	sync_components
	sync_content
	sync_media
	sync_browser
	sync_chrome
	sync_device
	sync_mojo
	sync_net
	sync_printing
	sync_remoting
	sync_services
	sync_third_party
	sync_tools
	sync_ui
	sync_url
	sync_webplayer
	sync_gen

	sync_assets
	sync_libs
	sync_jniLibs

	clean_project
	# NativeLibraries
}

do_sync
