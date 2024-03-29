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

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.util.Callback;

/**
 * InjectingFXMLLoader.java (UTF-8)
 *
 * Apr 13, 2013
 * @author tarrsalah.org
 */
public class InjectingFXMLLoader {
	/**
	 * 
	 * @param <N>
	 * @param injector
	 * @return a controller injected within an FXML.
	 */
	public static <N> N loadFXMLController(final N controller, URL url) throws IOException {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(url);
		loader.setControllerFactory(new Callback<Class<?>, Object>() {

			public Object call(Class<?> p) {
				return controller;
			}
		});
		loader.load();
		return loader.getController();
	}
}
