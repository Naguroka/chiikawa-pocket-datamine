package androidx.activity.result;

/* JADX INFO: compiled from: IntentSenderRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\nH\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "intentSender", "Landroid/content/IntentSender;", "fillInIntent", "Landroid/content/Intent;", "flagsMask", "", "flagsValues", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "getFillInIntent", "()Landroid/content/Intent;", "getFlagsMask", "()I", "getFlagsValues", "getIntentSender", "()Landroid/content/IntentSender;", "describeContents", "writeToParcel", "", "dest", "flags", "Builder", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntentSenderRequest implements android.os.Parcelable {
    private final android.content.Intent fillInIntent;
    private final int flagsMask;
    private final int flagsValues;
    private final android.content.IntentSender intentSender;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.activity.result.IntentSenderRequest.Companion INSTANCE = new androidx.activity.result.IntentSenderRequest.Companion(null);
    public static final android.os.Parcelable.Creator<androidx.activity.result.IntentSenderRequest> CREATOR = new android.os.Parcelable.Creator<androidx.activity.result.IntentSenderRequest>() { // from class: androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.IntentSenderRequest createFromParcel(android.os.Parcel inParcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new androidx.activity.result.IntentSenderRequest(inParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.IntentSenderRequest[] newArray(int size) {
            return new androidx.activity.result.IntentSenderRequest[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IntentSenderRequest(android.content.IntentSender intentSender, android.content.Intent intent, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i;
        this.flagsValues = i2;
    }

    public /* synthetic */ IntentSenderRequest(android.content.IntentSender intentSender, android.content.Intent intent, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(intentSender, (i3 & 2) != 0 ? null : intent, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public final android.content.IntentSender getIntentSender() {
        return this.intentSender;
    }

    public final android.content.Intent getFillInIntent() {
        return this.fillInIntent;
    }

    public final int getFlagsMask() {
        return this.flagsMask;
    }

    public final int getFlagsValues() {
        return this.flagsValues;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        android.os.Parcelable parcelable = parcel.readParcelable(android.content.IntentSender.class.getClassLoader());
        kotlin.jvm.internal.Intrinsics.checkNotNull(parcelable);
        this((android.content.IntentSender) parcelable, (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.intentSender, flags);
        dest.writeParcelable(this.fillInIntent, flags);
        dest.writeInt(this.flagsMask);
        dest.writeInt(this.flagsValues);
    }

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder;", "", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "(Landroid/app/PendingIntent;)V", "intentSender", "Landroid/content/IntentSender;", "(Landroid/content/IntentSender;)V", "fillInIntent", "Landroid/content/Intent;", "flagsMask", "", "flagsValues", "build", "Landroidx/activity/result/IntentSenderRequest;", "setFillInIntent", "setFlags", "values", "mask", "Flag", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private android.content.Intent fillInIntent;
        private int flagsMask;
        private int flagsValues;
        private final android.content.IntentSender intentSender;

        /* JADX INFO: compiled from: IntentSenderRequest.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder$Flag;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
        private @interface Flag {
        }

        public Builder(android.content.IntentSender intentSender) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.intentSender = intentSender;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(android.app.PendingIntent pendingIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            android.content.IntentSender intentSender = pendingIntent.getIntentSender();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }

        public final androidx.activity.result.IntentSenderRequest.Builder setFillInIntent(android.content.Intent fillInIntent) {
            this.fillInIntent = fillInIntent;
            return this;
        }

        public final androidx.activity.result.IntentSenderRequest.Builder setFlags(int values, int mask) {
            this.flagsValues = values;
            this.flagsMask = mask;
            return this;
        }

        public final androidx.activity.result.IntentSenderRequest build() {
            return new androidx.activity.result.IntentSenderRequest(this.intentSender, this.fillInIntent, this.flagsMask, this.flagsValues);
        }
    }

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/IntentSenderRequest;", "getCREATOR$annotations", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private Companion() {
        }
    }
}
