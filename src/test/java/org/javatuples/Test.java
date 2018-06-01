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

import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.SerializationUtils;

public class Test extends TestCase {

    
    
    public void testMain() throws Exception {
        
        
        final Tuple10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> decade =
            Tuple10.with(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10));

        List<Integer> decadeList = new ArrayList<Integer>();
        
        for (final Object value : decade) {
            decadeList.add((Integer)value);
            System.out.println(value);
        }
        
        final Tuple10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> decade2 =
            Tuple10.fromCollection(decadeList);
            
        assertEquals(decade, decade2);
        
        final Tuple10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> decade3 =
            Tuple10.fromIterable(decadeList);
        
        assertEquals(decade, decade3);
        
        final Tuple10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> decade4 =
            Tuple10.fromIterable(decadeList, 0);
        
        assertEquals(decade, decade4);
        
        decadeList.add(Integer.valueOf(100));
        
        final Tuple10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> decade5 =
            Tuple10.fromIterable(decadeList, 0);
        
        assertEquals(decade, decade5);

        
        final Tuple10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> decade100 =
            Tuple10.with(Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(100));
        
        final Tuple10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> decade6 =
            Tuple10.fromIterable(decadeList, 1);
        
        assertEquals(decade100, decade6);

        
        final Tuple9<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> ennead =
            Tuple9.with(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9));

        System.out.println(ennead.addAt1("Pepito"));
        System.out.println(ennead.add(new Socket()));
     
        final Tuple6<String,Integer,String,String,String,String> sextet =
            Tuple6.with("1.0",Integer.valueOf(2),"3.0","4.0","5.0","6.0");
        
        System.out.println(sextet);
        System.out.println(sextet.addAt3("Perico"));
        
        Tuple2<String,Object> pair = Tuple2.with("a", null);
        
        final Object o = null;
        assertTrue(pair.contains("a"));
        assertTrue(pair.contains(null));
        assertTrue(pair.containsAll(o));
        assertTrue(pair.containsAll(null,"a"));
        assertTrue(!pair.containsAll(null,"b"));
        
        final byte[] serSextet = SerializationUtils.serialize(sextet);
        System.out.println(Arrays.asList(ArrayUtils.toObject(serSextet)));
        final Tuple6<String,Integer,String,String,String,String> sextetUnSer =
            (Tuple6<String,Integer,String,String,String,String>) SerializationUtils.deserialize(serSextet);
        System.out.println(sextetUnSer);
        
        
        
        String str = null;
        Integer integ = null;
        Double[] doubleArray = null;
        
        Tuple3<String,Integer,Double[]> triplet = Tuple3.with(str, integ, doubleArray);
        
        System.out.println(triplet);

        
        Tuple2<String,Integer> pair1 = Tuple2.with("hello", Integer.valueOf(23));
        Tuple5<String,Integer,Double,String,String> quintet =
            Tuple5.with("a", Integer.valueOf(3), Double.valueOf(34.2), "b", "c");

        Tuple2<String,Integer> pair2 = new Tuple2<String,Integer>("hello", Integer.valueOf(23));
        Tuple5<String,Integer,Double,String,String> quintet2 =
            new Tuple5<String,Integer,Double,String,String>("a", Integer.valueOf(3), Double.valueOf(34.2), "b", "c");

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(quintet);
        System.out.println(quintet2);
        
        try {
            quintet2.getValue(8);
            assertTrue(false);
        } catch (IllegalArgumentException e) {
            // OK
        } catch (Exception e) {
            throw e;
        }
        
        
        
        final List<Tuple> tuples = new ArrayList<Tuple>();
        tuples.add(Tuple5.with(0, 87, 21, 2, 2));
        tuples.add(Tuple5.with(0, 1, 1, 4, 1));
        tuples.add(Tuple5.with(0, 1, 1, 4, 0));
        tuples.add(Tuple5.with(0, 1, 1, 4, 2));
        tuples.add(Tuple5.with(24, 12, 99, 0, 14));
        tuples.add(Tuple5.with(24, 12, 84, 4, 2));
        tuples.add(Tuple4.with(24, 12, 84, 4));
        tuples.add(Tuple4.with(24, 12, 84, 3));
        tuples.add(Tuple4.with(24, 12, 84, 0));
        tuples.add(Tuple4.with(25, 2, 84, 0));
        tuples.add(Tuple4.with(22, 12, 84, 9));
        tuples.add(Tuple6.with(0, 0, 0, 0, 0, 0));
        tuples.add(Tuple6.with(0, 0, 0, 2, 0, 0));
        tuples.add(Tuple6.with(0, 87, 21, 2, 1, 0));
        
        System.out.println("-");
        for (final Tuple tuple : tuples) {
            System.out.println(tuple);
        }
        Collections.sort(tuples);
        System.out.println("-");
        for (final Tuple tuple : tuples) {
            System.out.println(tuple);
        }
        System.out.println("-");
        
    }
    
    

}
