package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class InsnList implements java.lang.Iterable<org.objectweb.asm.tree.AbstractInsnNode> {
    org.objectweb.asm.tree.AbstractInsnNode[] cache;
    private org.objectweb.asm.tree.AbstractInsnNode firstInsn;
    private org.objectweb.asm.tree.AbstractInsnNode lastInsn;
    private int size;

    public int size() {
        return this.size;
    }

    public org.objectweb.asm.tree.AbstractInsnNode getFirst() {
        return this.firstInsn;
    }

    public org.objectweb.asm.tree.AbstractInsnNode getLast() {
        return this.lastInsn;
    }

    public org.objectweb.asm.tree.AbstractInsnNode get(int i) {
        if (i < 0 || i >= this.size) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (this.cache == null) {
            this.cache = toArray();
        }
        return this.cache[i];
    }

    public boolean contains(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.firstInsn;
        while (abstractInsnNode2 != null && abstractInsnNode2 != abstractInsnNode) {
            abstractInsnNode2 = abstractInsnNode2.nextInsn;
        }
        return abstractInsnNode2 != null;
    }

    public int indexOf(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        if (this.cache == null) {
            this.cache = toArray();
        }
        return abstractInsnNode.index;
    }

    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        for (org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.firstInsn; abstractInsnNode != null; abstractInsnNode = abstractInsnNode.nextInsn) {
            abstractInsnNode.accept(methodVisitor);
        }
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> iterator() {
        return iterator(0);
    }

    public java.util.ListIterator<org.objectweb.asm.tree.AbstractInsnNode> iterator(int i) {
        return new org.objectweb.asm.tree.InsnList.InsnListIterator(i);
    }

    public org.objectweb.asm.tree.AbstractInsnNode[] toArray() {
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.firstInsn;
        org.objectweb.asm.tree.AbstractInsnNode[] abstractInsnNodeArr = new org.objectweb.asm.tree.AbstractInsnNode[this.size];
        int i = 0;
        while (abstractInsnNode != null) {
            abstractInsnNodeArr[i] = abstractInsnNode;
            abstractInsnNode.index = i;
            abstractInsnNode = abstractInsnNode.nextInsn;
            i++;
        }
        return abstractInsnNodeArr;
    }

    public void set(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2) {
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode3 = abstractInsnNode.nextInsn;
        abstractInsnNode2.nextInsn = abstractInsnNode3;
        if (abstractInsnNode3 != null) {
            abstractInsnNode3.previousInsn = abstractInsnNode2;
        } else {
            this.lastInsn = abstractInsnNode2;
        }
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode4 = abstractInsnNode.previousInsn;
        abstractInsnNode2.previousInsn = abstractInsnNode4;
        if (abstractInsnNode4 != null) {
            abstractInsnNode4.nextInsn = abstractInsnNode2;
        } else {
            this.firstInsn = abstractInsnNode2;
        }
        if (this.cache != null) {
            int i = abstractInsnNode.index;
            this.cache[i] = abstractInsnNode2;
            abstractInsnNode2.index = i;
        } else {
            abstractInsnNode2.index = 0;
        }
        abstractInsnNode.index = -1;
        abstractInsnNode.previousInsn = null;
        abstractInsnNode.nextInsn = null;
    }

    public void add(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        this.size++;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.lastInsn;
        if (abstractInsnNode2 == null) {
            this.firstInsn = abstractInsnNode;
            this.lastInsn = abstractInsnNode;
        } else {
            abstractInsnNode2.nextInsn = abstractInsnNode;
            abstractInsnNode.previousInsn = this.lastInsn;
        }
        this.lastInsn = abstractInsnNode;
        this.cache = null;
        abstractInsnNode.index = 0;
    }

    public void add(org.objectweb.asm.tree.InsnList insnList) {
        int i = insnList.size;
        if (i == 0) {
            return;
        }
        this.size += i;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.lastInsn;
        if (abstractInsnNode == null) {
            this.firstInsn = insnList.firstInsn;
            this.lastInsn = insnList.lastInsn;
        } else {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = insnList.firstInsn;
            abstractInsnNode.nextInsn = abstractInsnNode2;
            abstractInsnNode2.previousInsn = this.lastInsn;
            this.lastInsn = insnList.lastInsn;
        }
        this.cache = null;
        insnList.removeAll(false);
    }

    public void insert(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        this.size++;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.firstInsn;
        if (abstractInsnNode2 == null) {
            this.firstInsn = abstractInsnNode;
            this.lastInsn = abstractInsnNode;
        } else {
            abstractInsnNode2.previousInsn = abstractInsnNode;
            abstractInsnNode.nextInsn = this.firstInsn;
        }
        this.firstInsn = abstractInsnNode;
        this.cache = null;
        abstractInsnNode.index = 0;
    }

    public void insert(org.objectweb.asm.tree.InsnList insnList) {
        int i = insnList.size;
        if (i == 0) {
            return;
        }
        this.size += i;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.firstInsn;
        if (abstractInsnNode == null) {
            this.firstInsn = insnList.firstInsn;
            this.lastInsn = insnList.lastInsn;
        } else {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = insnList.lastInsn;
            abstractInsnNode.previousInsn = abstractInsnNode2;
            abstractInsnNode2.nextInsn = this.firstInsn;
            this.firstInsn = insnList.firstInsn;
        }
        this.cache = null;
        insnList.removeAll(false);
    }

    public void insert(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2) {
        this.size++;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode3 = abstractInsnNode.nextInsn;
        if (abstractInsnNode3 == null) {
            this.lastInsn = abstractInsnNode2;
        } else {
            abstractInsnNode3.previousInsn = abstractInsnNode2;
        }
        abstractInsnNode.nextInsn = abstractInsnNode2;
        abstractInsnNode2.nextInsn = abstractInsnNode3;
        abstractInsnNode2.previousInsn = abstractInsnNode;
        this.cache = null;
        abstractInsnNode2.index = 0;
    }

    public void insert(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.InsnList insnList) {
        int i = insnList.size;
        if (i == 0) {
            return;
        }
        this.size += i;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = insnList.firstInsn;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode3 = insnList.lastInsn;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode4 = abstractInsnNode.nextInsn;
        if (abstractInsnNode4 == null) {
            this.lastInsn = abstractInsnNode3;
        } else {
            abstractInsnNode4.previousInsn = abstractInsnNode3;
        }
        abstractInsnNode.nextInsn = abstractInsnNode2;
        abstractInsnNode3.nextInsn = abstractInsnNode4;
        abstractInsnNode2.previousInsn = abstractInsnNode;
        this.cache = null;
        insnList.removeAll(false);
    }

    public void insertBefore(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2) {
        this.size++;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode3 = abstractInsnNode.previousInsn;
        if (abstractInsnNode3 == null) {
            this.firstInsn = abstractInsnNode2;
        } else {
            abstractInsnNode3.nextInsn = abstractInsnNode2;
        }
        abstractInsnNode.previousInsn = abstractInsnNode2;
        abstractInsnNode2.nextInsn = abstractInsnNode;
        abstractInsnNode2.previousInsn = abstractInsnNode3;
        this.cache = null;
        abstractInsnNode2.index = 0;
    }

    public void insertBefore(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.InsnList insnList) {
        int i = insnList.size;
        if (i == 0) {
            return;
        }
        this.size += i;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = insnList.firstInsn;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode3 = insnList.lastInsn;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode4 = abstractInsnNode.previousInsn;
        if (abstractInsnNode4 == null) {
            this.firstInsn = abstractInsnNode2;
        } else {
            abstractInsnNode4.nextInsn = abstractInsnNode2;
        }
        abstractInsnNode.previousInsn = abstractInsnNode3;
        abstractInsnNode3.nextInsn = abstractInsnNode;
        abstractInsnNode2.previousInsn = abstractInsnNode4;
        this.cache = null;
        insnList.removeAll(false);
    }

    public void remove(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        this.size--;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = abstractInsnNode.nextInsn;
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode3 = abstractInsnNode.previousInsn;
        if (abstractInsnNode2 == null) {
            if (abstractInsnNode3 == null) {
                this.firstInsn = null;
                this.lastInsn = null;
            } else {
                abstractInsnNode3.nextInsn = null;
                this.lastInsn = abstractInsnNode3;
            }
        } else if (abstractInsnNode3 == null) {
            this.firstInsn = abstractInsnNode2;
            abstractInsnNode2.previousInsn = null;
        } else {
            abstractInsnNode3.nextInsn = abstractInsnNode2;
            abstractInsnNode2.previousInsn = abstractInsnNode3;
        }
        this.cache = null;
        abstractInsnNode.index = -1;
        abstractInsnNode.previousInsn = null;
        abstractInsnNode.nextInsn = null;
    }

    void removeAll(boolean z) {
        if (z) {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.firstInsn;
            while (abstractInsnNode != null) {
                org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = abstractInsnNode.nextInsn;
                abstractInsnNode.index = -1;
                abstractInsnNode.previousInsn = null;
                abstractInsnNode.nextInsn = null;
                abstractInsnNode = abstractInsnNode2;
            }
        }
        this.size = 0;
        this.firstInsn = null;
        this.lastInsn = null;
        this.cache = null;
    }

    public void clear() {
        removeAll(false);
    }

    public void resetLabels() {
        for (org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.firstInsn; abstractInsnNode != null; abstractInsnNode = abstractInsnNode.nextInsn) {
            if (abstractInsnNode instanceof org.objectweb.asm.tree.LabelNode) {
                ((org.objectweb.asm.tree.LabelNode) abstractInsnNode).resetLabel();
            }
        }
    }

    private final class InsnListIterator implements java.util.ListIterator {
        org.objectweb.asm.tree.AbstractInsnNode nextInsn;
        org.objectweb.asm.tree.AbstractInsnNode previousInsn;
        org.objectweb.asm.tree.AbstractInsnNode remove;

        InsnListIterator(int i) {
            if (i < 0 || i > org.objectweb.asm.tree.InsnList.this.size()) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (i == org.objectweb.asm.tree.InsnList.this.size()) {
                this.nextInsn = null;
                this.previousInsn = org.objectweb.asm.tree.InsnList.this.getLast();
                return;
            }
            org.objectweb.asm.tree.AbstractInsnNode first = org.objectweb.asm.tree.InsnList.this.getFirst();
            for (int i2 = 0; i2 < i; i2++) {
                first = first.nextInsn;
            }
            this.nextInsn = first;
            this.previousInsn = first.previousInsn;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.nextInsn != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public java.lang.Object next() {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.nextInsn;
            if (abstractInsnNode == null) {
                throw new java.util.NoSuchElementException();
            }
            this.previousInsn = abstractInsnNode;
            this.nextInsn = abstractInsnNode.nextInsn;
            this.remove = abstractInsnNode;
            return abstractInsnNode;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.remove;
            if (abstractInsnNode != null) {
                org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.nextInsn;
                if (abstractInsnNode == abstractInsnNode2) {
                    this.nextInsn = abstractInsnNode2.nextInsn;
                } else {
                    this.previousInsn = this.previousInsn.previousInsn;
                }
                org.objectweb.asm.tree.InsnList.this.remove(this.remove);
                this.remove = null;
                return;
            }
            throw new java.lang.IllegalStateException();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.previousInsn != null;
        }

        @Override // java.util.ListIterator
        public java.lang.Object previous() {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.previousInsn;
            if (abstractInsnNode == null) {
                throw new java.util.NoSuchElementException();
            }
            this.nextInsn = abstractInsnNode;
            this.previousInsn = abstractInsnNode.previousInsn;
            this.remove = abstractInsnNode;
            return abstractInsnNode;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            if (this.nextInsn == null) {
                return org.objectweb.asm.tree.InsnList.this.size();
            }
            if (org.objectweb.asm.tree.InsnList.this.cache == null) {
                org.objectweb.asm.tree.InsnList insnList = org.objectweb.asm.tree.InsnList.this;
                insnList.cache = insnList.toArray();
            }
            return this.nextInsn.index;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            if (this.previousInsn == null) {
                return -1;
            }
            if (org.objectweb.asm.tree.InsnList.this.cache == null) {
                org.objectweb.asm.tree.InsnList insnList = org.objectweb.asm.tree.InsnList.this;
                insnList.cache = insnList.toArray();
            }
            return this.previousInsn.index;
        }

        @Override // java.util.ListIterator
        public void add(java.lang.Object obj) {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.nextInsn;
            if (abstractInsnNode != null) {
                org.objectweb.asm.tree.InsnList.this.insertBefore(abstractInsnNode, (org.objectweb.asm.tree.AbstractInsnNode) obj);
            } else {
                org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.previousInsn;
                if (abstractInsnNode2 != null) {
                    org.objectweb.asm.tree.InsnList.this.insert(abstractInsnNode2, (org.objectweb.asm.tree.AbstractInsnNode) obj);
                } else {
                    org.objectweb.asm.tree.InsnList.this.add((org.objectweb.asm.tree.AbstractInsnNode) obj);
                }
            }
            this.previousInsn = (org.objectweb.asm.tree.AbstractInsnNode) obj;
            this.remove = null;
        }

        @Override // java.util.ListIterator
        public void set(java.lang.Object obj) {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.remove;
            if (abstractInsnNode != null) {
                org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = (org.objectweb.asm.tree.AbstractInsnNode) obj;
                org.objectweb.asm.tree.InsnList.this.set(abstractInsnNode, abstractInsnNode2);
                if (this.remove == this.previousInsn) {
                    this.previousInsn = abstractInsnNode2;
                    return;
                } else {
                    this.nextInsn = abstractInsnNode2;
                    return;
                }
            }
            throw new java.lang.IllegalStateException();
        }
    }
}
