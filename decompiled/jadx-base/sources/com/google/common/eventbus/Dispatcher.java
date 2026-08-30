package com.google.common.eventbus;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
abstract class Dispatcher {
    abstract void dispatch(java.lang.Object event, java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers);

    Dispatcher() {
    }

    static com.google.common.eventbus.Dispatcher perThreadDispatchQueue() {
        return new com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher();
    }

    static com.google.common.eventbus.Dispatcher legacyAsync() {
        return new com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher();
    }

    static com.google.common.eventbus.Dispatcher immediate() {
        return com.google.common.eventbus.Dispatcher.ImmediateDispatcher.INSTANCE;
    }

    private static final class PerThreadQueuedDispatcher extends com.google.common.eventbus.Dispatcher {
        private final java.lang.ThreadLocal<java.lang.Boolean> dispatching;
        private final java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event>> queue;

        private PerThreadQueuedDispatcher() {
            this.queue = new java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event>>(this) { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // java.lang.ThreadLocal
                public java.util.Queue<com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event> initialValue() {
                    return com.google.common.collect.Queues.newArrayDeque();
                }
            };
            this.dispatching = new java.lang.ThreadLocal<java.lang.Boolean>(this) { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.2
                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.lang.ThreadLocal
                public java.lang.Boolean initialValue() {
                    return false;
                }
            };
        }

        @Override // com.google.common.eventbus.Dispatcher
        void dispatch(java.lang.Object event, java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers) {
            com.google.common.base.Preconditions.checkNotNull(event);
            com.google.common.base.Preconditions.checkNotNull(subscribers);
            java.util.Queue queue = (java.util.Queue) java.util.Objects.requireNonNull(this.queue.get());
            queue.offer(new com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event(event, subscribers));
            if (this.dispatching.get().booleanValue()) {
                return;
            }
            this.dispatching.set(true);
            while (true) {
                try {
                    com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event event2 = (com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event) queue.poll();
                    if (event2 == null) {
                        this.dispatching.remove();
                        this.queue.remove();
                        return;
                    } else {
                        while (event2.subscribers.hasNext()) {
                            ((com.google.common.eventbus.Subscriber) event2.subscribers.next()).dispatchEvent(event2.event);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    this.dispatching.remove();
                    this.queue.remove();
                    throw th;
                }
            }
        }

        private static final class Event {
            private final java.lang.Object event;
            private final java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers;

            private Event(java.lang.Object event, java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers) {
                this.event = event;
                this.subscribers = subscribers;
            }
        }
    }

    private static final class LegacyAsyncDispatcher extends com.google.common.eventbus.Dispatcher {
        private final java.util.concurrent.ConcurrentLinkedQueue<com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber> queue;

        private LegacyAsyncDispatcher() {
            this.queue = com.google.common.collect.Queues.newConcurrentLinkedQueue();
        }

        @Override // com.google.common.eventbus.Dispatcher
        void dispatch(java.lang.Object event, java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers) {
            com.google.common.base.Preconditions.checkNotNull(event);
            while (subscribers.hasNext()) {
                this.queue.add(new com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber(event, subscribers.next()));
            }
            while (true) {
                com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber eventWithSubscriberPoll = this.queue.poll();
                if (eventWithSubscriberPoll == null) {
                    return;
                } else {
                    eventWithSubscriberPoll.subscriber.dispatchEvent(eventWithSubscriberPoll.event);
                }
            }
        }

        private static final class EventWithSubscriber {
            private final java.lang.Object event;
            private final com.google.common.eventbus.Subscriber subscriber;

            private EventWithSubscriber(java.lang.Object event, com.google.common.eventbus.Subscriber subscriber) {
                this.event = event;
                this.subscriber = subscriber;
            }
        }
    }

    private static final class ImmediateDispatcher extends com.google.common.eventbus.Dispatcher {
        private static final com.google.common.eventbus.Dispatcher.ImmediateDispatcher INSTANCE = new com.google.common.eventbus.Dispatcher.ImmediateDispatcher();

        private ImmediateDispatcher() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        void dispatch(java.lang.Object event, java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers) {
            com.google.common.base.Preconditions.checkNotNull(event);
            while (subscribers.hasNext()) {
                subscribers.next().dispatchEvent(event);
            }
        }
    }
}
