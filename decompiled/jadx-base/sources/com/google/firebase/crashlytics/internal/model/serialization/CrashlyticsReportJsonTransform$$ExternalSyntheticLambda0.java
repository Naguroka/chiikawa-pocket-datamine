package com.google.firebase.crashlytics.internal.model.serialization;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class CrashlyticsReportJsonTransform$$ExternalSyntheticLambda0 implements com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser {
    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final java.lang.Object parse(android.util.JsonReader jsonReader) {
        return com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
    }
}
