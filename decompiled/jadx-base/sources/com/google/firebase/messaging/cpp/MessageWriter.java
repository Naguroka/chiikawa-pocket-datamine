package com.google.firebase.messaging.cpp;

/* JADX INFO: loaded from: classes5.dex */
public class MessageWriter {
    private static final com.google.firebase.messaging.cpp.MessageWriter DEFAULT_INSTANCE = new com.google.firebase.messaging.cpp.MessageWriter();
    static final java.lang.String LOCK_FILE = "FIREBASE_CLOUD_MESSAGING_LOCKFILE";
    static final java.lang.String STORAGE_FILE = "FIREBASE_CLOUD_MESSAGING_LOCAL_STORAGE";
    private static final java.lang.String TAG = "FIREBASE_MESSAGE_WRITER";

    private static java.lang.String emptyIfNull(java.lang.String str) {
        return str != null ? str : "";
    }

    private static java.lang.String priorityToString(int i) {
        if (i != 1) {
            return i != 2 ? "" : com.adjust.sdk.Constants.NORMAL;
        }
        return com.adjust.sdk.Constants.HIGH;
    }

    public static com.google.firebase.messaging.cpp.MessageWriter defaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void writeMessage(android.content.Context context, com.google.firebase.messaging.RemoteMessage remoteMessage, boolean z, android.net.Uri uri) {
        java.lang.String from = remoteMessage.getFrom();
        java.lang.String to = remoteMessage.getTo();
        java.lang.String messageId = remoteMessage.getMessageId();
        java.lang.String messageType = remoteMessage.getMessageType();
        java.util.Map<java.lang.String, java.lang.String> data = remoteMessage.getData();
        byte[] rawData = remoteMessage.getRawData();
        com.google.firebase.messaging.RemoteMessage.Notification notification = remoteMessage.getNotification();
        java.lang.String collapseKey = remoteMessage.getCollapseKey();
        int priority = remoteMessage.getPriority();
        int originalPriority = remoteMessage.getOriginalPriority();
        long sentTime = remoteMessage.getSentTime();
        int ttl = remoteMessage.getTtl();
        android.net.Uri link = (uri != null || notification == null) ? uri : notification.getLink();
        java.lang.String string = link != null ? link.toString() : null;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = from;
        objArr[1] = messageId;
        objArr[2] = data == null ? "(null)" : data.toString();
        objArr[3] = notification != null ? notification.toString() : "(null)";
        com.google.firebase.messaging.cpp.DebugLogging.log(TAG, java.lang.String.format("onMessageReceived from=%s message_id=%s, data=%s, notification=%s", objArr));
        writeMessageToInternalStorage(context, from, to, messageId, messageType, null, data, rawData, notification, z, string, collapseKey, priority, originalPriority, sentTime, ttl);
    }

    void writeMessageEventToInternalStorage(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        writeMessageToInternalStorage(context, null, null, str, str2, null, null, null, null, false, null, null, 0, 0, 0L, 0);
    }

    void writeMessageToInternalStorage(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr, com.google.firebase.messaging.RemoteMessage.Notification notification, boolean z, java.lang.String str6, java.lang.String str7, int i, int i2, long j, int i3) {
        byte[] bArrGenerateMessageByteBuffer = generateMessageByteBuffer(str, str2, str3, str4, str5, map, bArr, notification, z, str6, str7, i, i2, j, i3);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(bArrGenerateMessageByteBuffer.length);
        java.nio.channels.FileLock fileLockLock = null;
        try {
            try {
                try {
                    fileLockLock = context.openFileOutput(LOCK_FILE, 0).getChannel().lock();
                    java.io.FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(STORAGE_FILE, 32768);
                    fileOutputStreamOpenFileOutput.write(byteBufferAllocate.array());
                    fileOutputStreamOpenFileOutput.write(bArrGenerateMessageByteBuffer);
                    fileOutputStreamOpenFileOutput.close();
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
                if (fileLockLock == null) {
                } else {
                    fileLockLock.release();
                }
            }
        } catch (java.lang.Throwable th) {
            if (fileLockLock != null) {
                try {
                    fileLockLock.release();
                    throw th;
                } catch (java.lang.Exception e3) {
                    e3.printStackTrace();
                    throw th;
                }
            }
            throw th;
        }
    }

    private static byte[] generateMessageByteBuffer(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr, com.google.firebase.messaging.RemoteMessage.Notification notification, boolean z, java.lang.String str6, java.lang.String str7, int i, int i2, long j, int i3) {
        int iCreateDataVector;
        int iEndSerializedNotification;
        int i4;
        int iCreateBodyLocArgsVector;
        int iCreateTitleLocArgsVector;
        com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder = new com.google.flatbuffers.FlatBufferBuilder(0);
        int iCreateString = flatBufferBuilder.createString(emptyIfNull(str));
        int iCreateString2 = flatBufferBuilder.createString(emptyIfNull(str2));
        int iCreateString3 = flatBufferBuilder.createString(emptyIfNull(str3));
        int iCreateString4 = flatBufferBuilder.createString(emptyIfNull(str4));
        int iCreateString5 = flatBufferBuilder.createString(emptyIfNull(str5));
        int iCreateString6 = flatBufferBuilder.createString(emptyIfNull(str6));
        int iCreateString7 = flatBufferBuilder.createString(emptyIfNull(str7));
        int iCreateString8 = flatBufferBuilder.createString(priorityToString(i));
        int iCreateString9 = flatBufferBuilder.createString(priorityToString(i2));
        if (map != null) {
            int[] iArr = new int[map.size()];
            int i5 = 0;
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                iArr[i5] = com.google.firebase.messaging.cpp.DataPair.createDataPair(flatBufferBuilder, flatBufferBuilder.createString(entry.getKey()), flatBufferBuilder.createString(entry.getValue()));
                i5++;
            }
            iCreateDataVector = com.google.firebase.messaging.cpp.SerializedMessage.createDataVector(flatBufferBuilder, iArr);
        } else {
            iCreateDataVector = 0;
        }
        int iCreateByteVector = bArr != null ? flatBufferBuilder.createByteVector(bArr) : 0;
        if (notification != null) {
            int iCreateString10 = flatBufferBuilder.createString(emptyIfNull(notification.getTitle()));
            int iCreateString11 = flatBufferBuilder.createString(emptyIfNull(notification.getBody()));
            int iCreateString12 = flatBufferBuilder.createString(emptyIfNull(notification.getIcon()));
            int iCreateString13 = flatBufferBuilder.createString(emptyIfNull(notification.getSound()));
            int iCreateString14 = flatBufferBuilder.createString("");
            int iCreateString15 = flatBufferBuilder.createString(emptyIfNull(notification.getTag()));
            int iCreateString16 = flatBufferBuilder.createString(emptyIfNull(notification.getColor()));
            int iCreateString17 = flatBufferBuilder.createString(emptyIfNull(notification.getClickAction()));
            int iCreateString18 = flatBufferBuilder.createString(emptyIfNull(notification.getChannelId()));
            int iCreateString19 = flatBufferBuilder.createString(emptyIfNull(notification.getBodyLocalizationKey()));
            java.lang.String[] bodyLocalizationArgs = notification.getBodyLocalizationArgs();
            if (bodyLocalizationArgs != null) {
                int[] iArr2 = new int[bodyLocalizationArgs.length];
                int length = bodyLocalizationArgs.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    iArr2[i7] = flatBufferBuilder.createString(bodyLocalizationArgs[i6]);
                    i6++;
                    length = length;
                    i7++;
                }
                iCreateBodyLocArgsVector = com.google.firebase.messaging.cpp.SerializedNotification.createBodyLocArgsVector(flatBufferBuilder, iArr2);
            } else {
                iCreateBodyLocArgsVector = 0;
            }
            int iCreateString20 = flatBufferBuilder.createString(emptyIfNull(notification.getTitleLocalizationKey()));
            java.lang.String[] titleLocalizationArgs = notification.getTitleLocalizationArgs();
            if (titleLocalizationArgs != null) {
                int[] iArr3 = new int[titleLocalizationArgs.length];
                int length2 = titleLocalizationArgs.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2) {
                    iArr3[i9] = flatBufferBuilder.createString(titleLocalizationArgs[i8]);
                    i8++;
                    length2 = length2;
                    i9++;
                }
                iCreateTitleLocArgsVector = com.google.firebase.messaging.cpp.SerializedNotification.createTitleLocArgsVector(flatBufferBuilder, iArr3);
            } else {
                iCreateTitleLocArgsVector = 0;
            }
            com.google.firebase.messaging.cpp.SerializedNotification.startSerializedNotification(flatBufferBuilder);
            com.google.firebase.messaging.cpp.SerializedNotification.addTitle(flatBufferBuilder, iCreateString10);
            com.google.firebase.messaging.cpp.SerializedNotification.addBody(flatBufferBuilder, iCreateString11);
            com.google.firebase.messaging.cpp.SerializedNotification.addIcon(flatBufferBuilder, iCreateString12);
            com.google.firebase.messaging.cpp.SerializedNotification.addSound(flatBufferBuilder, iCreateString13);
            com.google.firebase.messaging.cpp.SerializedNotification.addBadge(flatBufferBuilder, iCreateString14);
            com.google.firebase.messaging.cpp.SerializedNotification.addTag(flatBufferBuilder, iCreateString15);
            com.google.firebase.messaging.cpp.SerializedNotification.addColor(flatBufferBuilder, iCreateString16);
            com.google.firebase.messaging.cpp.SerializedNotification.addClickAction(flatBufferBuilder, iCreateString17);
            com.google.firebase.messaging.cpp.SerializedNotification.addAndroidChannelId(flatBufferBuilder, iCreateString18);
            com.google.firebase.messaging.cpp.SerializedNotification.addBodyLocKey(flatBufferBuilder, iCreateString19);
            com.google.firebase.messaging.cpp.SerializedNotification.addBodyLocArgs(flatBufferBuilder, iCreateBodyLocArgsVector);
            com.google.firebase.messaging.cpp.SerializedNotification.addTitleLocKey(flatBufferBuilder, iCreateString20);
            com.google.firebase.messaging.cpp.SerializedNotification.addTitleLocArgs(flatBufferBuilder, iCreateTitleLocArgsVector);
            iEndSerializedNotification = com.google.firebase.messaging.cpp.SerializedNotification.endSerializedNotification(flatBufferBuilder);
        } else {
            iCreateString = iCreateString;
            iCreateString2 = iCreateString2;
            iCreateString3 = iCreateString3;
            iCreateString4 = iCreateString4;
            iEndSerializedNotification = 0;
        }
        com.google.firebase.messaging.cpp.SerializedMessage.startSerializedMessage(flatBufferBuilder);
        com.google.firebase.messaging.cpp.SerializedMessage.addFrom(flatBufferBuilder, iCreateString);
        com.google.firebase.messaging.cpp.SerializedMessage.addTo(flatBufferBuilder, iCreateString2);
        com.google.firebase.messaging.cpp.SerializedMessage.addMessageId(flatBufferBuilder, iCreateString3);
        com.google.firebase.messaging.cpp.SerializedMessage.addMessageType(flatBufferBuilder, iCreateString4);
        com.google.firebase.messaging.cpp.SerializedMessage.addPriority(flatBufferBuilder, iCreateString8);
        com.google.firebase.messaging.cpp.SerializedMessage.addOriginalPriority(flatBufferBuilder, iCreateString9);
        com.google.firebase.messaging.cpp.SerializedMessage.addSentTime(flatBufferBuilder, j);
        com.google.firebase.messaging.cpp.SerializedMessage.addTimeToLive(flatBufferBuilder, i3);
        com.google.firebase.messaging.cpp.SerializedMessage.addError(flatBufferBuilder, iCreateString5);
        com.google.firebase.messaging.cpp.SerializedMessage.addCollapseKey(flatBufferBuilder, iCreateString7);
        if (map != null) {
            com.google.firebase.messaging.cpp.SerializedMessage.addData(flatBufferBuilder, iCreateDataVector);
        }
        if (bArr != null) {
            com.google.firebase.messaging.cpp.SerializedMessage.addRawData(flatBufferBuilder, i4);
        }
        if (notification != null) {
            i4 = iCreateByteVector;
            com.google.firebase.messaging.cpp.SerializedMessage.addNotification(flatBufferBuilder, iEndSerializedNotification);
        }
        i4 = iCreateByteVector;
        com.google.firebase.messaging.cpp.SerializedMessage.addNotificationOpened(flatBufferBuilder, z);
        com.google.firebase.messaging.cpp.SerializedMessage.addLink(flatBufferBuilder, iCreateString6);
        int iEndSerializedMessage = com.google.firebase.messaging.cpp.SerializedMessage.endSerializedMessage(flatBufferBuilder);
        com.google.firebase.messaging.cpp.SerializedEvent.startSerializedEvent(flatBufferBuilder);
        com.google.firebase.messaging.cpp.SerializedEvent.addEventType(flatBufferBuilder, (byte) 1);
        com.google.firebase.messaging.cpp.SerializedEvent.addEvent(flatBufferBuilder, iEndSerializedMessage);
        flatBufferBuilder.finish(com.google.firebase.messaging.cpp.SerializedEvent.endSerializedEvent(flatBufferBuilder));
        return flatBufferBuilder.sizedByteArray();
    }
}
