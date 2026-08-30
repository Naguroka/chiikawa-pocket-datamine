package com.unity3d.services.core.request.metrics;

/* JADX INFO: loaded from: classes6.dex */
public class InitMetric {
    private static final java.lang.String INIT_GAME_ID_CHANGED = "native_initialize_game_id_changed";
    private static final java.lang.String INIT_GAME_ID_SAME = "native_initialize_game_id_same";
    private static final java.lang.String INIT_TAG_GAME_ID = "game_id";
    private static final java.lang.String INIT_TAG_PREVIOUS_GAME_ID = "previous_game_id";
    private static final java.lang.String INIT_TAG_PREVIOUS_TEST_MODE = "previous_test_mode";
    private static final java.lang.String INIT_TAG_TEST_MODE = "test_mode";
    private static final java.lang.String INIT_TEST_MODE_CHANGED = "native_initialize_test_mode_changed";
    private static final java.lang.String INIT_TEST_MODE_SAME = "native_initialize_test_mode_same";

    public static com.unity3d.services.core.request.metrics.Metric newInitGameIdChanged(java.lang.String str, java.lang.String str2) {
        return new com.unity3d.services.core.request.metrics.Metric(INIT_GAME_ID_CHANGED, null, new java.util.HashMap<java.lang.String, java.lang.String>(str2, str) { // from class: com.unity3d.services.core.request.metrics.InitMetric.1
            final /* synthetic */ java.lang.String val$gameId;
            final /* synthetic */ java.lang.String val$previousGameId;

            {
                this.val$gameId = str2;
                this.val$previousGameId = str;
                put(com.unity3d.services.core.request.metrics.InitMetric.INIT_TAG_GAME_ID, str2);
                put(com.unity3d.services.core.request.metrics.InitMetric.INIT_TAG_PREVIOUS_GAME_ID, str);
            }
        });
    }

    public static com.unity3d.services.core.request.metrics.Metric newInitGameIdSame(java.lang.String str, java.lang.String str2) {
        return new com.unity3d.services.core.request.metrics.Metric(INIT_GAME_ID_SAME, null, new java.util.HashMap<java.lang.String, java.lang.String>(str2, str) { // from class: com.unity3d.services.core.request.metrics.InitMetric.2
            final /* synthetic */ java.lang.String val$gameId;
            final /* synthetic */ java.lang.String val$previousGameId;

            {
                this.val$gameId = str2;
                this.val$previousGameId = str;
                put(com.unity3d.services.core.request.metrics.InitMetric.INIT_TAG_GAME_ID, str2);
                put(com.unity3d.services.core.request.metrics.InitMetric.INIT_TAG_PREVIOUS_GAME_ID, str);
            }
        });
    }

    public static com.unity3d.services.core.request.metrics.Metric newInitTestModeChanged(java.lang.Boolean bool, java.lang.Boolean bool2) {
        return new com.unity3d.services.core.request.metrics.Metric(INIT_TEST_MODE_CHANGED, null, new java.util.HashMap<java.lang.String, java.lang.String>(bool2, bool) { // from class: com.unity3d.services.core.request.metrics.InitMetric.3
            final /* synthetic */ java.lang.Boolean val$previousTestMode;
            final /* synthetic */ java.lang.Boolean val$testMode;

            {
                this.val$testMode = bool2;
                this.val$previousTestMode = bool;
                put(com.unity3d.services.core.request.metrics.InitMetric.INIT_TAG_TEST_MODE, bool2.toString());
                put(com.unity3d.services.core.request.metrics.InitMetric.INIT_TAG_PREVIOUS_TEST_MODE, bool.toString());
            }
        });
    }

    public static com.unity3d.services.core.request.metrics.Metric newInitTestModeSame(java.lang.Boolean bool, java.lang.Boolean bool2) {
        return new com.unity3d.services.core.request.metrics.Metric(INIT_TEST_MODE_SAME, null, new java.util.HashMap<java.lang.String, java.lang.String>(bool2, bool) { // from class: com.unity3d.services.core.request.metrics.InitMetric.4
            final /* synthetic */ java.lang.Boolean val$previousTestMode;
            final /* synthetic */ java.lang.Boolean val$testMode;

            {
                this.val$testMode = bool2;
                this.val$previousTestMode = bool;
                put(com.unity3d.services.core.request.metrics.InitMetric.INIT_TAG_TEST_MODE, bool2.toString());
                put(com.unity3d.services.core.request.metrics.InitMetric.INIT_TAG_PREVIOUS_TEST_MODE, bool.toString());
            }
        });
    }
}
