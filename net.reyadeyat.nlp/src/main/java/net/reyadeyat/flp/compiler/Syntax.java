/*
 * Copyright (C) 2023 Reyadeyat
 *
 * Reyadeyat/FLP is licensed under the
 * BSD 3-Clause "New" or "Revised" License
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://reyadeyat.net/FLP.LICENSE 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.reyadeyat.flp.compiler;

import java.util.ArrayList;

/**
 * 
 * Description
 * 
 *
 * @author Mohammad Nabil Mostafa
 * <a href="mailto:code@reyadeyat.net">code@reyadeyat.net</a>
 * 
 * @since 2023.01.01
 */
public class Syntax {
    private Operandum operandum;
    private ArrayList<Operandum> prevOperandums;
    private ArrayList<Operandum> nextOperandums;
    
    public Syntax(Operandum operandum) {
        this.operandum = operandum;
        prevOperandums = new ArrayList<Operandum>();
        nextOperandums = new ArrayList<Operandum>();
    }
    
    public void prviouse(Operandum operandum) {
        prevOperandums.add(operandum);
    }
    
    public void next(Operandum operandum) {
        nextOperandums.add(operandum);
    }
}
