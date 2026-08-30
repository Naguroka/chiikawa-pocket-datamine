package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class ConnectedControllersManager<T> {
    private final androidx.collection.ArrayMap<T, androidx.media3.session.MediaSession.ControllerInfo> controllerInfoMap = new androidx.collection.ArrayMap<>();
    private final androidx.collection.ArrayMap<androidx.media3.session.MediaSession.ControllerInfo, androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T>> controllerRecords = new androidx.collection.ArrayMap<>();
    private final java.lang.Object lock = new java.lang.Object();
    private final java.lang.ref.WeakReference<androidx.media3.session.MediaSessionImpl> sessionImpl;

    public interface AsyncCommand {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> run();
    }

    public ConnectedControllersManager(androidx.media3.session.MediaSessionImpl mediaSessionImpl) {
        this.sessionImpl = new java.lang.ref.WeakReference<>(mediaSessionImpl);
    }

    public void addController(T t, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        synchronized (this.lock) {
            androidx.media3.session.MediaSession.ControllerInfo controller = getController(t);
            if (controller == null) {
                this.controllerInfoMap.put(t, controllerInfo);
                this.controllerRecords.put(controllerInfo, new androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<>(t, new androidx.media3.session.SequencedFutureManager(), sessionCommands, commands));
            } else {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) androidx.media3.common.util.Assertions.checkStateNotNull(this.controllerRecords.get(controller));
                connectedControllerRecord.sessionCommands = sessionCommands;
                connectedControllerRecord.playerCommands = commands;
            }
        }
    }

    public void updateCommandsFromSession(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        synchronized (this.lock) {
            androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
            if (connectedControllerRecord != null) {
                connectedControllerRecord.sessionCommands = sessionCommands;
                connectedControllerRecord.playerCommands = commands;
            }
        }
    }

    public androidx.media3.common.Player.Commands getAvailablePlayerCommands(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
            if (connectedControllerRecord == null) {
                return null;
            }
            return connectedControllerRecord.playerCommands;
        }
    }

    public void removeController(T t) {
        androidx.media3.session.MediaSession.ControllerInfo controller = getController(t);
        if (controller != null) {
            removeController(controller);
        }
    }

    public void removeController(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecordRemove = this.controllerRecords.remove(controllerInfo);
            if (connectedControllerRecordRemove == null) {
                return;
            }
            this.controllerInfoMap.remove(connectedControllerRecordRemove.controllerKey);
            connectedControllerRecordRemove.sequencedFutureManager.release();
            final androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
            if (mediaSessionImpl == null || mediaSessionImpl.isReleased()) {
                return;
            }
            androidx.media3.common.util.Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.ConnectedControllersManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.session.ConnectedControllersManager.lambda$removeController$0(mediaSessionImpl, controllerInfo);
                }
            });
        }
    }

    static /* synthetic */ void lambda$removeController$0(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        if (mediaSessionImpl.isReleased()) {
            return;
        }
        mediaSessionImpl.onDisconnectedOnHandler(controllerInfo);
    }

    public com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> getConnectedControllers() {
        com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> immutableListCopyOf;
        synchronized (this.lock) {
            immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.controllerInfoMap.values());
        }
        return immutableListCopyOf;
    }

    public boolean isConnected(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        boolean z;
        synchronized (this.lock) {
            z = this.controllerRecords.get(controllerInfo) != null;
        }
        return z;
    }

    public androidx.media3.session.SequencedFutureManager getSequencedFutureManager(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = this.controllerRecords.get(controllerInfo);
        }
        if (connectedControllerRecord != null) {
            return connectedControllerRecord.sequencedFutureManager;
        }
        return null;
    }

    public androidx.media3.session.SequencedFutureManager getSequencedFutureManager(T t) {
        androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord;
        synchronized (this.lock) {
            androidx.media3.session.MediaSession.ControllerInfo controller = getController(t);
            connectedControllerRecord = controller != null ? this.controllerRecords.get(controller) : null;
        }
        if (connectedControllerRecord != null) {
            return connectedControllerRecord.sequencedFutureManager;
        }
        return null;
    }

    public boolean isSessionCommandAvailable(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommand sessionCommand) {
        androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = this.controllerRecords.get(controllerInfo);
        }
        return connectedControllerRecord != null && connectedControllerRecord.sessionCommands.contains(sessionCommand);
    }

    public boolean isSessionCommandAvailable(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = this.controllerRecords.get(controllerInfo);
        }
        return connectedControllerRecord != null && connectedControllerRecord.sessionCommands.contains(i);
    }

    public boolean isPlayerCommandAvailable(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = this.controllerRecords.get(controllerInfo);
        }
        androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        return connectedControllerRecord != null && connectedControllerRecord.playerCommands.contains(i) && mediaSessionImpl != null && mediaSessionImpl.getPlayerWrapper().getAvailableCommands().contains(i);
    }

    public androidx.media3.session.MediaSession.ControllerInfo getController(T t) {
        androidx.media3.session.MediaSession.ControllerInfo controllerInfo;
        synchronized (this.lock) {
            controllerInfo = this.controllerInfoMap.get(t);
        }
        return controllerInfo;
    }

    public void addToCommandQueue(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i, androidx.media3.session.ConnectedControllersManager.AsyncCommand asyncCommand) {
        synchronized (this.lock) {
            androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
            if (connectedControllerRecord != null) {
                connectedControllerRecord.commandQueuePlayerCommands = connectedControllerRecord.commandQueuePlayerCommands.buildUpon().add(i).build();
                connectedControllerRecord.commandQueue.add(asyncCommand);
            }
        }
    }

    public void flushCommandQueue(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
            if (connectedControllerRecord == null) {
                return;
            }
            final androidx.media3.common.Player.Commands commands = connectedControllerRecord.commandQueuePlayerCommands;
            connectedControllerRecord.commandQueuePlayerCommands = androidx.media3.common.Player.Commands.EMPTY;
            connectedControllerRecord.commandQueue.add(new androidx.media3.session.ConnectedControllersManager.AsyncCommand() { // from class: androidx.media3.session.ConnectedControllersManager$$ExternalSyntheticLambda2
                @Override // androidx.media3.session.ConnectedControllersManager.AsyncCommand
                public final com.google.common.util.concurrent.ListenableFuture run() {
                    return this.f$0.m226x2298a984(controllerInfo, commands);
                }
            });
            if (connectedControllerRecord.commandQueueIsFlushing) {
                return;
            }
            connectedControllerRecord.commandQueueIsFlushing = true;
            flushCommandQueue(connectedControllerRecord);
        }
    }

    /* JADX INFO: renamed from: lambda$flushCommandQueue$1$androidx-media3-session-ConnectedControllersManager, reason: not valid java name */
    /* synthetic */ com.google.common.util.concurrent.ListenableFuture m226x2298a984(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.Player.Commands commands) {
        androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl != null) {
            mediaSessionImpl.onPlayerInteractionFinishedOnHandler(controllerInfo, commands);
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    private void flushCommandQueue(final androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord) {
        androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl == null) {
            return;
        }
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            final androidx.media3.session.ConnectedControllersManager.AsyncCommand asyncCommandPoll = connectedControllerRecord.commandQueue.poll();
            if (asyncCommandPoll == null) {
                connectedControllerRecord.commandQueueIsFlushing = false;
                return;
            } else {
                final java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(true);
                androidx.media3.common.util.Util.postOrRun(mediaSessionImpl.getApplicationHandler(), mediaSessionImpl.callWithControllerForCurrentRequestSet(getController(connectedControllerRecord.controllerKey), new java.lang.Runnable() { // from class: androidx.media3.session.ConnectedControllersManager$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m228x3d0e0c86(asyncCommandPoll, atomicBoolean2, connectedControllerRecord, atomicBoolean);
                    }
                }));
                atomicBoolean2.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$flushCommandQueue$3$androidx-media3-session-ConnectedControllersManager, reason: not valid java name */
    /* synthetic */ void m228x3d0e0c86(androidx.media3.session.ConnectedControllersManager.AsyncCommand asyncCommand, final java.util.concurrent.atomic.AtomicBoolean atomicBoolean, final androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord, final java.util.concurrent.atomic.AtomicBoolean atomicBoolean2) {
        asyncCommand.run().addListener(new java.lang.Runnable() { // from class: androidx.media3.session.ConnectedControllersManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m227xafd35b05(atomicBoolean, connectedControllerRecord, atomicBoolean2);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    /* JADX INFO: renamed from: lambda$flushCommandQueue$2$androidx-media3-session-ConnectedControllersManager, reason: not valid java name */
    /* synthetic */ void m227xafd35b05(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2) {
        synchronized (this.lock) {
            if (!atomicBoolean.get()) {
                flushCommandQueue(connectedControllerRecord);
            } else {
                atomicBoolean2.set(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ConnectedControllerRecord<T> {
        public boolean commandQueueIsFlushing;
        public final T controllerKey;
        public androidx.media3.common.Player.Commands playerCommands;
        public final androidx.media3.session.SequencedFutureManager sequencedFutureManager;
        public androidx.media3.session.SessionCommands sessionCommands;
        public final java.util.Deque<androidx.media3.session.ConnectedControllersManager.AsyncCommand> commandQueue = new java.util.ArrayDeque();
        public androidx.media3.common.Player.Commands commandQueuePlayerCommands = androidx.media3.common.Player.Commands.EMPTY;

        public ConnectedControllerRecord(T t, androidx.media3.session.SequencedFutureManager sequencedFutureManager, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
            this.controllerKey = t;
            this.sequencedFutureManager = sequencedFutureManager;
            this.sessionCommands = sessionCommands;
            this.playerCommands = commands;
        }
    }
}
