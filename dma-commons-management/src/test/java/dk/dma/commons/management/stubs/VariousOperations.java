/* Copyright (c) 2011 Danish Maritime Authority
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.dma.commons.management.stubs;

import dk.dma.commons.management.Description;
import dk.dma.commons.management.ManagedOperation;

/**
 * @author Kasper Nielsen
 */
public class VariousOperations {
    public int invokeCount;

    @ManagedOperation(name = "m2")
    public void method2() {
        invokeCount++;
    }

    @ManagedOperation()
    public String method3() {
        return "m3";
    }

    @ManagedOperation()
    public String method4(String arg) {
        return arg.toUpperCase();
    }

    @Description("desca")
    @ManagedOperation()
    public void method5() {}

    @Description("desc")
    @ManagedOperation(name = "foo")
    public void method6() {}
}
