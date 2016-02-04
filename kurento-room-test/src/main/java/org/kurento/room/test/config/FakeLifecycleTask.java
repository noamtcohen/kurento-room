/*
 * (C) Copyright 2016 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the GNU Lesser General Public License (LGPL)
 * version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package org.kurento.room.test.config;

import java.util.concurrent.CountDownLatch;

import org.kurento.room.test.fake.util.FakeSession;

/**
 * The task for a fake-type user lifecycle.
 *
 * @author Radu Tom Vlad (rvlad@naevatec.com)
 * @since 6.3.2
 */
public interface FakeLifecycleTask {

  public void run(int numUser, String room, int iteration, CountDownLatch activeLiveLatch,
      String mediaUri, FakeSession session) throws Exception;

}
