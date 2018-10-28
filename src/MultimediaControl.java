/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/**
 * <h1>MultimediaControl Interface</h1>
 * Item Java <b>Interface</b> to improve rapid development The Interface is a group of related
 * methods with empty bodies.
 * <b>Interface</b> form a contract between the class and the outside world, and this
 * contract is enforced at build time by the compiler.
 * All methods defined by that interface must appear in its source code before the class will
 * successfully compile.
 *
 * <p>This is a <a href="package-summary.html">interface class</a></p>
 *
 * @author Juan Gaviria
 * @version 0.1
 * @serial
 * @since 0.2
 */

// Create the Item interface
public interface MultimediaControl {

  public void play();

  public void stop();

  public void previous();

  public void next();
}
