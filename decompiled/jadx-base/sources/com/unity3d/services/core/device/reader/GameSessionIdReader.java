package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class GameSessionIdReader implements com.unity3d.services.core.device.reader.IGameSessionIdReader {
    private static final int GAME_SESSION_ID_LENGTH = 12;
    private static volatile com.unity3d.services.core.device.reader.GameSessionIdReader _instance;
    private java.lang.Long gameSessionId;

    private GameSessionIdReader() {
    }

    public static com.unity3d.services.core.device.reader.GameSessionIdReader getInstance() {
        if (_instance == null) {
            synchronized (com.unity3d.services.core.device.reader.GameSessionIdReader.class) {
                if (_instance == null) {
                    _instance = new com.unity3d.services.core.device.reader.GameSessionIdReader();
                }
            }
        }
        return _instance;
    }

    @Override // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public synchronized java.lang.Long getGameSessionId() {
        if (this.gameSessionId == null) {
            generate();
        }
        return this.gameSessionId;
    }

    @Override // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public synchronized java.lang.Long getGameSessionIdAndStore() {
        if (this.gameSessionId == null) {
            generate();
            store();
        }
        return this.gameSessionId;
    }

    private void generate() {
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        this.gameSessionId = java.lang.Long.valueOf((java.lang.Long.toString(uuidRandomUUID.getMostSignificantBits()) + java.lang.Long.toString(uuidRandomUUID.getLeastSignificantBits())).replace("-", "").substring(0, 12));
    }

    private void store() {
        com.unity3d.services.core.device.Storage storage;
        if (!com.unity3d.services.core.device.StorageManager.init(com.unity3d.services.core.properties.ClientProperties.getApplicationContext()) || (storage = com.unity3d.services.core.device.StorageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE)) == null) {
            return;
        }
        storage.set(com.unity3d.services.core.device.reader.JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this.gameSessionId);
        storage.writeStorage();
    }
}
