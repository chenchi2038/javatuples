/*
 * =============================================================================
 * 
 *   Copyright (c) 2010, The JAVATUPLES team (http://www.javatuples.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.javatuples;

import java.util.Collection;
import java.util.Iterator;

import org.javatuples.valueintf.IValue0;
import org.javatuples.valueintf.IValue1;
import org.javatuples.valueintf.IValue2;
import org.javatuples.valueintf.IValue3;
import org.javatuples.valueintf.IValue4;
import org.javatuples.valueintf.IValue5;

/**
 * <p>
 * A tuple of six elements.
 * </p> 
 * 
 * @since 1.0
 * 
 * @author Daniel Fern&aacute;ndez
 *
 */
public final class Tuple6<A,B,C,D,E,F>
        extends Tuple
        implements IValue0<A>,
                   IValue1<B>,
                   IValue2<C>,
                   IValue3<D>,
                   IValue4<E>,
                   IValue5<F> {

    private static final long serialVersionUID = -367678052827219823L;

    private static final int SIZE = 6;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    
    
    
    public static <A,B,C,D,E,F> Tuple6<A,B,C,D,E,F> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5) {
        return new Tuple6<A,B,C,D,E,F>(value0,value1,value2,value3,value4,value5);
    }

    
    /**
     * <p>
     * Create tuple from array. Array has to have exactly six elements.
     * </p>
     * 
     * @param <X> the array component type 
     * @param array the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple6<X,X,X,X,X,X> fromArray(final X[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length != 6) {
            throw new IllegalArgumentException("Array must have exactly 6 elements in order to create a Tuple6. Size is " + array.length);
        }
        return new Tuple6<X,X,X,X,X,X>(
                array[0],array[1],array[2],array[3],array[4],
                array[5]);
    }

    
    /**
     * <p>
     * Create tuple from collection. Collection has to have exactly six elements.
     * </p>
     * 
     * @param <X> the collection component type 
     * @param collection the collection to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple6<X,X,X,X,X,X> fromCollection(final Collection<X> collection) {
        return fromIterable(collection);
    }

    
    
    /**
     * <p>
     * Create tuple from iterable. Iterable has to have exactly six elements.
     * </p>
     * 
     * @param <X> the iterable component type 
     * @param iterable the iterable to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple6<X,X,X,X,X,X> fromIterable(final Iterable<X> iterable) {
        return fromIterable(iterable, 0, true);
    }

    
    
    /**
     * <p>
     * Create tuple from iterable, starting from the specified index. Iterable
     * can have more (or less) elements than the tuple to be created.
     * </p>
     * 
     * @param <X> the iterable component type 
     * @param iterable the iterable to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple6<X,X,X,X,X,X> fromIterable(final Iterable<X> iterable, int index) {
        return fromIterable(iterable, index, false);
    }

    
    

    private static <X> Tuple6<X,X,X,X,X,X> fromIterable(final Iterable<X> iterable, int index, final boolean exactSize) {
        
        if (iterable == null) {
            throw new IllegalArgumentException("Iterable cannot be null");
        }

        boolean tooFewElements = false; 
        
        X element0 = null;
        X element1 = null;
        X element2 = null;
        X element3 = null;
        X element4 = null;
        X element5 = null;
        
        final Iterator<X> iter = iterable.iterator();
        
        int i = 0;
        while (i < index) {
            if (iter.hasNext()) {
                iter.next();
            } else {
                tooFewElements = true;
            }
            i++;
        }
        
        if (iter.hasNext()) {
            element0 = iter.next();
        } else {
            tooFewElements = true;
        }
        
        if (iter.hasNext()) {
            element1 = iter.next();
        } else {
            tooFewElements = true;
        }
        
        if (iter.hasNext()) {
            element2 = iter.next();
        } else {
            tooFewElements = true;
        }
        
        if (iter.hasNext()) {
            element3 = iter.next();
        } else {
            tooFewElements = true;
        }
        
        if (iter.hasNext()) {
            element4 = iter.next();
        } else {
            tooFewElements = true;
        }
        
        if (iter.hasNext()) {
            element5 = iter.next();
        } else {
            tooFewElements = true;
        }
        
        if (tooFewElements && exactSize) {
            throw new IllegalArgumentException("Not enough elements for creating a Tuple6 (6 needed)");
        }
        
        if (iter.hasNext() && exactSize) {
            throw new IllegalArgumentException("Iterable must have exactly 6 available elements in order to create a Tuple6.");
        }
        
        return new Tuple6<X,X,X,X,X,X>(
                element0, element1, element2, element3, element4,
                element5);
        
    }
    
    
    
    
    public Tuple6(
            final A value0,
            final B value1,
            final C value2,
            final D value3,
            final E value4,
            final F value5) {
        super(value0, value1, value2, value3, value4, value5);
        this.val0 = value0;
        this.val1 = value1;
        this.val2 = value2;
        this.val3 = value3;
        this.val4 = value4;
        this.val5 = value5;
    }


    public A getValue0() {
        return this.val0;
    }


    public B getValue1() {
        return this.val1;
    }


    public C getValue2() {
        return this.val2;
    }


    public D getValue3() {
        return this.val3;
    }


    public E getValue4() {
        return this.val4;
    }


    public F getValue5() {
        return this.val5;
    }


    @Override
    public int getSize() {
        return SIZE;
    }
    
    
    
    

    
    
    
    public <X0> Tuple7<X0,A,B,C,D,E,F> addAt0(final X0 value0) {
        return new Tuple7<X0,A,B,C,D,E,F>(
                value0, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0> Tuple7<A,X0,B,C,D,E,F> addAt1(final X0 value0) {
        return new Tuple7<A,X0,B,C,D,E,F>(
                this.val0, value0, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0> Tuple7<A,B,X0,C,D,E,F> addAt2(final X0 value0) {
        return new Tuple7<A,B,X0,C,D,E,F>(
                this.val0, this.val1, value0, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0> Tuple7<A,B,C,X0,D,E,F> addAt3(final X0 value0) {
        return new Tuple7<A,B,C,X0,D,E,F>(
                this.val0, this.val1, this.val2, value0, this.val3, this.val4, this.val5);
    }
    
    public <X0> Tuple7<A,B,C,D,X0,E,F> addAt4(final X0 value0) {
        return new Tuple7<A,B,C,D,X0,E,F>(
                this.val0, this.val1, this.val2, this.val3, value0, this.val4, this.val5);
    }
    
    public <X0> Tuple7<A,B,C,D,E,X0,F> addAt5(final X0 value0) {
        return new Tuple7<A,B,C,D,E,X0,F>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, this.val5);
    }
    
    public <X0> Tuple7<A,B,C,D,E,F,X0> addAt6(final X0 value0) {
        return new Tuple7<A,B,C,D,E,F,X0>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0);
    }

    
    
    
    
    public <X0,X1> Tuple8<X0,X1,A,B,C,D,E,F> addAt0(final X0 value0, final X1 value1) {
        return new Tuple8<X0,X1,A,B,C,D,E,F>(
                value0, value1, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1> Tuple8<A,X0,X1,B,C,D,E,F> addAt1(final X0 value0, final X1 value1) {
        return new Tuple8<A,X0,X1,B,C,D,E,F>(
                this.val0, value0, value1, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1> Tuple8<A,B,X0,X1,C,D,E,F> addAt2(final X0 value0, final X1 value1) {
        return new Tuple8<A,B,X0,X1,C,D,E,F>(
                this.val0, this.val1, value0, value1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1> Tuple8<A,B,C,X0,X1,D,E,F> addAt3(final X0 value0, final X1 value1) {
        return new Tuple8<A,B,C,X0,X1,D,E,F>(
                this.val0, this.val1, this.val2, value0, value1, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1> Tuple8<A,B,C,D,X0,X1,E,F> addAt4(final X0 value0, final X1 value1) {
        return new Tuple8<A,B,C,D,X0,X1,E,F>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, this.val4, this.val5);
    }
    
    public <X0,X1> Tuple8<A,B,C,D,E,X0,X1,F> addAt5(final X0 value0, final X1 value1) {
        return new Tuple8<A,B,C,D,E,X0,X1,F>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, this.val5);
    }
    
    public <X0,X1> Tuple8<A,B,C,D,E,F,X0,X1> addAt6(final X0 value0, final X1 value1) {
        return new Tuple8<A,B,C,D,E,F,X0,X1>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, value1);
    }
    


    
    
    
    
    public <X0,X1,X2> Tuple9<X0,X1,X2,A,B,C,D,E,F> addAt0(final X0 value0, final X1 value1, final X2 value2) {
        return new Tuple9<X0,X1,X2,A,B,C,D,E,F>(
                value0, value1, value2, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2> Tuple9<A,X0,X1,X2,B,C,D,E,F> addAt1(final X0 value0, final X1 value1, final X2 value2) {
        return new Tuple9<A,X0,X1,X2,B,C,D,E,F>(
                this.val0, value0, value1, value2, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2> Tuple9<A,B,X0,X1,X2,C,D,E,F> addAt2(final X0 value0, final X1 value1, final X2 value2) {
        return new Tuple9<A,B,X0,X1,X2,C,D,E,F>(
                this.val0, this.val1, value0, value1, value2, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2> Tuple9<A,B,C,X0,X1,X2,D,E,F> addAt3(final X0 value0, final X1 value1, final X2 value2) {
        return new Tuple9<A,B,C,X0,X1,X2,D,E,F>(
                this.val0, this.val1, this.val2, value0, value1, value2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2> Tuple9<A,B,C,D,X0,X1,X2,E,F> addAt4(final X0 value0, final X1 value1, final X2 value2) {
        return new Tuple9<A,B,C,D,X0,X1,X2,E,F>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, this.val4, this.val5);
    }
    
    public <X0,X1,X2> Tuple9<A,B,C,D,E,X0,X1,X2,F> addAt5(final X0 value0, final X1 value1, final X2 value2) {
        return new Tuple9<A,B,C,D,E,X0,X1,X2,F>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, value2, this.val5);
    }
    
    public <X0,X1,X2> Tuple9<A,B,C,D,E,F,X0,X1,X2> addAt6(final X0 value0, final X1 value1, final X2 value2) {
        return new Tuple9<A,B,C,D,E,F,X0,X1,X2>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, value1, value2);
    }
    


    
    
    
    
    public <X0,X1,X2,X3> Tuple10<X0,X1,X2,X3,A,B,C,D,E,F> addAt0(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Tuple10<X0,X1,X2,X3,A,B,C,D,E,F>(
                value0, value1, value2, value3, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2,X3> Tuple10<A,X0,X1,X2,X3,B,C,D,E,F> addAt1(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Tuple10<A,X0,X1,X2,X3,B,C,D,E,F>(
                this.val0, value0, value1, value2, value3, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2,X3> Tuple10<A,B,X0,X1,X2,X3,C,D,E,F> addAt2(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Tuple10<A,B,X0,X1,X2,X3,C,D,E,F>(
                this.val0, this.val1, value0, value1, value2, value3, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2,X3> Tuple10<A,B,C,X0,X1,X2,X3,D,E,F> addAt3(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Tuple10<A,B,C,X0,X1,X2,X3,D,E,F>(
                this.val0, this.val1, this.val2, value0, value1, value2, value3, this.val3, this.val4, this.val5);
    }
    
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,X0,X1,X2,X3,E,F> addAt4(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Tuple10<A,B,C,D,X0,X1,X2,X3,E,F>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, value3, this.val4, this.val5);
    }
    
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,E,X0,X1,X2,X3,F> addAt5(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Tuple10<A,B,C,D,E,X0,X1,X2,X3,F>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, value2, value3, this.val5);
    }
    
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,E,F,X0,X1,X2,X3> addAt6(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return new Tuple10<A,B,C,D,E,F,X0,X1,X2,X3>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, value1, value2, value3);
    }

    
    
    
    
    public <X0> Tuple7<X0,A,B,C,D,E,F> addAt0(final Unit<X0> tuple) {
        return addAt0(tuple.getValue0());
    }
    
    public <X0> Tuple7<A,X0,B,C,D,E,F> addAt1(final Unit<X0> tuple) {
        return addAt1(tuple.getValue0());
    }
    
    public <X0> Tuple7<A,B,X0,C,D,E,F> addAt2(final Unit<X0> tuple) {
        return addAt2(tuple.getValue0());
    }
    
    public <X0> Tuple7<A,B,C,X0,D,E,F> addAt3(final Unit<X0> tuple) {
        return addAt3(tuple.getValue0());
    }
    
    public <X0> Tuple7<A,B,C,D,X0,E,F> addAt4(final Unit<X0> tuple) {
        return addAt4(tuple.getValue0());
    }
    
    public <X0> Tuple7<A,B,C,D,E,X0,F> addAt5(final Unit<X0> tuple) {
        return addAt5(tuple.getValue0());
    }
    
    public <X0> Tuple7<A,B,C,D,E,F,X0> addAt6(final Unit<X0> tuple) {
        return addAt6(tuple.getValue0());
    }
    


    
    
    
    
    public <X0,X1> Tuple8<X0,X1,A,B,C,D,E,F> addAt0(final Tuple2<X0,X1> tuple) {
        return addAt0(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Tuple8<A,X0,X1,B,C,D,E,F> addAt1(final Tuple2<X0,X1> tuple) {
        return addAt1(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Tuple8<A,B,X0,X1,C,D,E,F> addAt2(final Tuple2<X0,X1> tuple) {
        return addAt2(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Tuple8<A,B,C,X0,X1,D,E,F> addAt3(final Tuple2<X0,X1> tuple) {
        return addAt3(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Tuple8<A,B,C,D,X0,X1,E,F> addAt4(final Tuple2<X0,X1> tuple) {
        return addAt4(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Tuple8<A,B,C,D,E,X0,X1,F> addAt5(final Tuple2<X0,X1> tuple) {
        return addAt5(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Tuple8<A,B,C,D,E,F,X0,X1> addAt6(final Tuple2<X0,X1> tuple) {
        return addAt6(tuple.getValue0(),tuple.getValue1());
    }

    
    

    
    
    
    
    public <X0,X1,X2> Tuple9<X0,X1,X2,A,B,C,D,E,F> addAt0(final Tuple3<X0,X1,X2> tuple) {
        return addAt0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Tuple9<A,X0,X1,X2,B,C,D,E,F> addAt1(final Tuple3<X0,X1,X2> tuple) {
        return addAt1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Tuple9<A,B,X0,X1,X2,C,D,E,F> addAt2(final Tuple3<X0,X1,X2> tuple) {
        return addAt2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Tuple9<A,B,C,X0,X1,X2,D,E,F> addAt3(final Tuple3<X0,X1,X2> tuple) {
        return addAt3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Tuple9<A,B,C,D,X0,X1,X2,E,F> addAt4(final Tuple3<X0,X1,X2> tuple) {
        return addAt4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Tuple9<A,B,C,D,E,X0,X1,X2,F> addAt5(final Tuple3<X0,X1,X2> tuple) {
        return addAt5(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Tuple9<A,B,C,D,E,F,X0,X1,X2> addAt6(final Tuple3<X0,X1,X2> tuple) {
        return addAt6(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    
    


    
    
    
    
    public <X0,X1,X2,X3> Tuple10<X0,X1,X2,X3,A,B,C,D,E,F> addAt0(final Tuple4<X0,X1,X2,X3> tuple) {
        return addAt0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Tuple10<A,X0,X1,X2,X3,B,C,D,E,F> addAt1(final Tuple4<X0,X1,X2,X3> tuple) {
        return addAt1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Tuple10<A,B,X0,X1,X2,X3,C,D,E,F> addAt2(final Tuple4<X0,X1,X2,X3> tuple) {
        return addAt2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Tuple10<A,B,C,X0,X1,X2,X3,D,E,F> addAt3(final Tuple4<X0,X1,X2,X3> tuple) {
        return addAt3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,X0,X1,X2,X3,E,F> addAt4(final Tuple4<X0,X1,X2,X3> tuple) {
        return addAt4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,E,X0,X1,X2,X3,F> addAt5(final Tuple4<X0,X1,X2,X3> tuple) {
        return addAt5(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }
    
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,E,F,X0,X1,X2,X3> addAt6(final Tuple4<X0,X1,X2,X3> tuple) {
        return addAt6(tuple.getValue0(),tuple.getValue1(),tuple.getValue2(),tuple.getValue3());
    }

    
    
    
    
    
    
    
    
    public <X0> Tuple7<A,B,C,D,E,F,X0> add(final X0 value0) {
        return addAt6(value0);
    }
    
    
    public <X0> Tuple7<A,B,C,D,E,F,X0> add(final Unit<X0> tuple) {
        return addAt6(tuple);
    }
    
    
    
    
    public <X0,X1> Tuple8<A,B,C,D,E,F,X0,X1> add(final X0 value0, final X1 value1) {
        return addAt6(value0, value1);
    }
    
    
    public <X0,X1> Tuple8<A,B,C,D,E,F,X0,X1> add(final Tuple2<X0,X1> tuple) {
        return addAt6(tuple);
    }
    
    
    
    
    public <X0,X1,X2> Tuple9<A,B,C,D,E,F,X0,X1,X2> add(final X0 value0, final X1 value1, final X2 value2) {
        return addAt6(value0, value1, value2);
    }
    
    
    public <X0,X1,X2> Tuple9<A,B,C,D,E,F,X0,X1,X2> add(final Tuple3<X0,X1,X2> tuple) {
        return addAt6(tuple);
    }
    
    
    
    
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,E,F,X0,X1,X2,X3> add(final X0 value0, final X1 value1, final X2 value2, final X3 value3) {
        return addAt6(value0, value1, value2, value3);
    }
    
    
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,E,F,X0,X1,X2,X3> add(final Tuple4<X0,X1,X2,X3> tuple) {
        return addAt6(tuple);
    }
    
    

    
    
    
    
    
    public <X> Tuple6<X,B,C,D,E,F> setAt0(final X value) {
        return new Tuple6<X,B,C,D,E,F>(
                value, this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X> Tuple6<A,X,C,D,E,F> setAt1(final X value) {
        return new Tuple6<A,X,C,D,E,F>(
                this.val0, value, this.val2, this.val3, this.val4, this.val5);
    }
    
    public <X> Tuple6<A,B,X,D,E,F> setAt2(final X value) {
        return new Tuple6<A,B,X,D,E,F>(
                this.val0, this.val1, value, this.val3, this.val4, this.val5);
    }
    
    public <X> Tuple6<A,B,C,X,E,F> setAt3(final X value) {
        return new Tuple6<A,B,C,X,E,F>(
                this.val0, this.val1, this.val2, value, this.val4, this.val5);
    }
    
    public <X> Tuple6<A,B,C,D,X,F> setAt4(final X value) {
        return new Tuple6<A,B,C,D,X,F>(
                this.val0, this.val1, this.val2, this.val3, value, this.val5);
    }
    
    public <X> Tuple6<A,B,C,D,E,X> setAt5(final X value) {
        return new Tuple6<A,B,C,D,E,X>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value);
    }
    
    
    
    
    
    
    
    public Tuple5<B,C,D,E,F> removeFrom0() {
        return new Tuple5<B,C,D,E,F>(
                this.val1, this.val2, this.val3, this.val4, this.val5);
    }
    
    public Tuple5<A,C,D,E,F> removeFrom1() {
        return new Tuple5<A,C,D,E,F>(
                this.val0, this.val2, this.val3, this.val4, this.val5);
    }
    
    public Tuple5<A,B,D,E,F> removeFrom2() {
        return new Tuple5<A,B,D,E,F>(
                this.val0, this.val1, this.val3, this.val4, this.val5);
    }
    
    public Tuple5<A,B,C,E,F> removeFrom3() {
        return new Tuple5<A,B,C,E,F>(
                this.val0, this.val1, this.val2, this.val4, this.val5);
    }
    
    public Tuple5<A,B,C,D,F> removeFrom4() {
        return new Tuple5<A,B,C,D,F>(
                this.val0, this.val1, this.val2, this.val3, this.val5);
    }
    
    public Tuple5<A,B,C,D,E> removeFrom5() {
        return new Tuple5<A,B,C,D,E>(
                this.val0, this.val1, this.val2, this.val3, this.val4);
    }
    
    
    
    
}
