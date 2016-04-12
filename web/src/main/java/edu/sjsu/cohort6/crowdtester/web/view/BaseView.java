/*
 * Copyright (c) 2015 San Jose State University.   
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package edu.sjsu.cohort6.crowdtester.web.view;

import edu.sjsu.cohort6.crowdtester.database.dao.DBClient;
import spark.template.freemarker.FreeMarkerEngine;

/**
 * Base view that all other views extend.
 *
 * This ensures all views have a certain route/path to the view template page and has a handle to the DB client.
 *
 * @author rwatsh on 11/26/15.
 */
public abstract class BaseView {
    protected String viewPath;
    protected DBClient dbClient;
    protected final FreeMarkerEngine templateEngine;

    protected BaseView(String viewPath, DBClient dbClient) {
        this.viewPath = viewPath;
        this.dbClient = dbClient;
        templateEngine = Util.getFreeMarkerEngine();
    }
}
