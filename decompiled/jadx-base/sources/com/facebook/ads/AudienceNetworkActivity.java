package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class AudienceNetworkActivity extends android.app.Activity {
    private com.facebook.ads.internal.api.AudienceNetworkActivityApi mAudienceNetworkActivityApi;
    private final com.facebook.ads.internal.api.AudienceNetworkActivityApi mAudienceNetworkActivityParentApi = new com.facebook.ads.internal.api.AudienceNetworkActivityApi() { // from class: com.facebook.ads.AudienceNetworkActivity.1
        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onCreate(android.os.Bundle bundle) {
            com.facebook.ads.AudienceNetworkActivity.super.onCreate(bundle);
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onStart() {
            com.facebook.ads.AudienceNetworkActivity.super.onStart();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onPause() {
            com.facebook.ads.AudienceNetworkActivity.super.onPause();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onResume() {
            com.facebook.ads.AudienceNetworkActivity.super.onResume();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onStop() {
            com.facebook.ads.AudienceNetworkActivity.super.onStop();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onSaveInstanceState(android.os.Bundle bundle) {
            com.facebook.ads.AudienceNetworkActivity.super.onSaveInstanceState(bundle);
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void finish(int i) {
            com.facebook.ads.AudienceNetworkActivity.super.finish();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onDestroy() {
            com.facebook.ads.AudienceNetworkActivity.super.onDestroy();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onBackPressed() {
            com.facebook.ads.AudienceNetworkActivity.super.onBackPressed();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onConfigurationChanged(android.content.res.Configuration configuration) {
            com.facebook.ads.AudienceNetworkActivity.super.onConfigurationChanged(configuration);
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            return com.facebook.ads.AudienceNetworkActivity.super.onTouchEvent(motionEvent);
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onActivityResult(int i, int i2, android.content.Intent intent) {
            com.facebook.ads.AudienceNetworkActivity.super.onActivityResult(i, i2, intent);
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
            com.facebook.ads.AudienceNetworkActivity.super.dump(str, fileDescriptor, printWriter, strArr);
        }
    };

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.facebook.ads.internal.api.AudienceNetworkActivityApi audienceNetworkActivityApiCreateAudienceNetworkActivity = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(this).createAudienceNetworkActivity(this, this.mAudienceNetworkActivityParentApi);
        this.mAudienceNetworkActivityApi = audienceNetworkActivityApiCreateAudienceNetworkActivity;
        audienceNetworkActivityApiCreateAudienceNetworkActivity.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mAudienceNetworkActivityApi.onStart();
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mAudienceNetworkActivityApi.onResume();
    }

    @Override // android.app.Activity
    public void onPause() {
        this.mAudienceNetworkActivityApi.onPause();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        this.mAudienceNetworkActivityApi.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void finish() {
        this.mAudienceNetworkActivityApi.finish(0);
    }

    @Override // android.app.Activity
    protected void onStop() {
        this.mAudienceNetworkActivityApi.onStop();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.mAudienceNetworkActivityApi.onDestroy();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mAudienceNetworkActivityApi.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.mAudienceNetworkActivityApi.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.mAudienceNetworkActivityApi.onTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        this.mAudienceNetworkActivityApi.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        this.mAudienceNetworkActivityApi.dump(str, fileDescriptor, printWriter, strArr);
    }
}
