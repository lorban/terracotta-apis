/*
 *
 *  The contents of this file are subject to the Terracotta Public License Version
 *  2.0 (the "License"); You may not use this file except in compliance with the
 *  License. You may obtain a copy of the License at
 *
 *  http://terracotta.org/legal/terracotta-public-license.
 *
 *  Software distributed under the License is distributed on an "AS IS" basis,
 *  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 *  the specific language governing rights and limitations under the License.
 *
 *  The Covered Software is Connection API.
 *
 *  The Initial Developer of the Covered Software is
 *  Terracotta, Inc., a Software AG company
 *
 */
package org.terracotta.connection;


/**
 * The exception type thrown when a connection fails to be established by the connection service.
 */
public class ConnectionException extends Exception {
  private static final long serialVersionUID = 1L;

  /**
   * This type can only be created as a high-level wrapper over the underlying cause.
   * 
   * @param cause The underlying throwable, describing what went wrong, specifically
   */
  public ConnectionException(Throwable cause) {
    super(cause);
  }
}
