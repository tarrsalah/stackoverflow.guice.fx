/*
 * Copyright 2013 tarrsalah.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tarrsalah.stackoverflow.guice.fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Parent;

/**
 * Controller.java (UTF-8)
 *
 * Apr 13, 2013
 * @author tarrsalah.org
 */
public class Controller implements IController{
	
	@FXML Parent root;

	public Parent getRoot() {
		return root;
	}				

	public void printButton() {
		System.out.println("Hello Guice !!");
	}

	public void initialize(URL url, ResourceBundle rb) {
	}

}
