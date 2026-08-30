package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Queues {
    private Queues() {
    }

    public static <E> java.util.concurrent.ArrayBlockingQueue<E> newArrayBlockingQueue(int capacity) {
        return new java.util.concurrent.ArrayBlockingQueue<>(capacity);
    }

    public static <E> java.util.ArrayDeque<E> newArrayDeque() {
        return new java.util.ArrayDeque<>();
    }

    public static <E> java.util.ArrayDeque<E> newArrayDeque(java.lang.Iterable<? extends E> elements) {
        if (elements instanceof java.util.Collection) {
            return new java.util.ArrayDeque<>((java.util.Collection) elements);
        }
        java.util.ArrayDeque<E> arrayDeque = new java.util.ArrayDeque<>();
        com.google.common.collect.Iterables.addAll(arrayDeque, elements);
        return arrayDeque;
    }

    public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue() {
        return new java.util.concurrent.ConcurrentLinkedQueue<>();
    }

    public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(java.lang.Iterable<? extends E> elements) {
        if (elements instanceof java.util.Collection) {
            return new java.util.concurrent.ConcurrentLinkedQueue<>((java.util.Collection) elements);
        }
        java.util.concurrent.ConcurrentLinkedQueue<E> concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
        com.google.common.collect.Iterables.addAll(concurrentLinkedQueue, elements);
        return concurrentLinkedQueue;
    }

    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque() {
        return new java.util.concurrent.LinkedBlockingDeque<>();
    }

    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(int capacity) {
        return new java.util.concurrent.LinkedBlockingDeque<>(capacity);
    }

    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(java.lang.Iterable<? extends E> elements) {
        if (elements instanceof java.util.Collection) {
            return new java.util.concurrent.LinkedBlockingDeque<>((java.util.Collection) elements);
        }
        java.util.concurrent.LinkedBlockingDeque<E> linkedBlockingDeque = new java.util.concurrent.LinkedBlockingDeque<>();
        com.google.common.collect.Iterables.addAll(linkedBlockingDeque, elements);
        return linkedBlockingDeque;
    }

    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue() {
        return new java.util.concurrent.LinkedBlockingQueue<>();
    }

    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(int capacity) {
        return new java.util.concurrent.LinkedBlockingQueue<>(capacity);
    }

    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(java.lang.Iterable<? extends E> elements) {
        if (elements instanceof java.util.Collection) {
            return new java.util.concurrent.LinkedBlockingQueue<>((java.util.Collection) elements);
        }
        java.util.concurrent.LinkedBlockingQueue<E> linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue<>();
        com.google.common.collect.Iterables.addAll(linkedBlockingQueue, elements);
        return linkedBlockingQueue;
    }

    public static <E extends java.lang.Comparable> java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue() {
        return new java.util.concurrent.PriorityBlockingQueue<>();
    }

    public static <E extends java.lang.Comparable> java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue(java.lang.Iterable<? extends E> elements) {
        if (elements instanceof java.util.Collection) {
            return new java.util.concurrent.PriorityBlockingQueue<>((java.util.Collection) elements);
        }
        java.util.concurrent.PriorityBlockingQueue<E> priorityBlockingQueue = new java.util.concurrent.PriorityBlockingQueue<>();
        com.google.common.collect.Iterables.addAll(priorityBlockingQueue, elements);
        return priorityBlockingQueue;
    }

    public static <E extends java.lang.Comparable> java.util.PriorityQueue<E> newPriorityQueue() {
        return new java.util.PriorityQueue<>();
    }

    public static <E extends java.lang.Comparable> java.util.PriorityQueue<E> newPriorityQueue(java.lang.Iterable<? extends E> elements) {
        if (elements instanceof java.util.Collection) {
            return new java.util.PriorityQueue<>((java.util.Collection) elements);
        }
        java.util.PriorityQueue<E> priorityQueue = new java.util.PriorityQueue<>();
        com.google.common.collect.Iterables.addAll(priorityQueue, elements);
        return priorityQueue;
    }

    public static <E> java.util.concurrent.SynchronousQueue<E> newSynchronousQueue() {
        return new java.util.concurrent.SynchronousQueue<>();
    }

    public static <E> int drain(java.util.concurrent.BlockingQueue<E> q, java.util.Collection<? super E> buffer, int numElements, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        com.google.common.base.Preconditions.checkNotNull(buffer);
        long jNanoTime = java.lang.System.nanoTime() + unit.toNanos(timeout);
        int iDrainTo = 0;
        while (iDrainTo < numElements) {
            iDrainTo += q.drainTo(buffer, numElements - iDrainTo);
            if (iDrainTo < numElements) {
                E ePoll = q.poll(jNanoTime - java.lang.System.nanoTime(), java.util.concurrent.TimeUnit.NANOSECONDS);
                if (ePoll == null) {
                    break;
                }
                buffer.add(ePoll);
                iDrainTo++;
            }
        }
        return iDrainTo;
    }

    public static <E> int drainUninterruptibly(java.util.concurrent.BlockingQueue<E> q, java.util.Collection<? super E> buffer, int numElements, long timeout, java.util.concurrent.TimeUnit unit) {
        E ePoll;
        com.google.common.base.Preconditions.checkNotNull(buffer);
        long jNanoTime = java.lang.System.nanoTime() + unit.toNanos(timeout);
        int iDrainTo = 0;
        boolean z = false;
        while (iDrainTo < numElements) {
            try {
                iDrainTo += q.drainTo(buffer, numElements - iDrainTo);
                if (iDrainTo < numElements) {
                    while (true) {
                        try {
                            ePoll = q.poll(jNanoTime - java.lang.System.nanoTime(), java.util.concurrent.TimeUnit.NANOSECONDS);
                            break;
                        } catch (java.lang.InterruptedException unused) {
                            z = true;
                        }
                    }
                    if (ePoll == null) {
                        break;
                    }
                    buffer.add(ePoll);
                    iDrainTo++;
                }
            } finally {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
        return iDrainTo;
    }

    public static <E> java.util.Queue<E> synchronizedQueue(java.util.Queue<E> queue) {
        return com.google.common.collect.Synchronized.queue(queue, null);
    }

    public static <E> java.util.Deque<E> synchronizedDeque(java.util.Deque<E> deque) {
        return com.google.common.collect.Synchronized.deque(deque, null);
    }
}
