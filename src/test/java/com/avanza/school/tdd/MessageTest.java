/*
 * Copyright 2017 Avanza Bank AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.avanza.school.tdd;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

public class MessageTest {

    @Rule
    public ExpectedException expectation = ExpectedException.none();

    @Test
    public void should_create_a_new_message_with_given_() throws Exception {
        assertEquals("Hello world!", new Message("Hello world!").value());
    }

    @Test
    public void should_fail_if_message_is_blank() throws Exception {
        expectation.expect(IllegalArgumentException.class);
        expectation.expectMessage(is("A message cannot be blank"));

        new Message("   ");
    }
}
