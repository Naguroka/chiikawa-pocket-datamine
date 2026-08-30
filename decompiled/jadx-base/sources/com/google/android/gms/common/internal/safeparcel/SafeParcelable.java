package com.google.android.gms.common.internal.safeparcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface SafeParcelable extends android.os.Parcelable {
    public static final java.lang.String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public @interface Class {
        java.lang.String creator();

        boolean creatorIsFinal() default true;

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public @interface Constructor {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public @interface Field {
        java.lang.String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        java.lang.String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public @interface Indicator {
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public @interface Param {
        int id();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public @interface RemovedParam {
        java.lang.String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        java.lang.String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public @interface Reserved {
        int[] value();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public @interface VersionField {
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
