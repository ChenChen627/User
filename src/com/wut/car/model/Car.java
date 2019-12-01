package com.wut.car.model;

import java.io.Serializable;

/**
 * car 儌僨儖僋儔僗.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Car implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** name. */
	private String name;

	/** yanse. */
	private String yanse;

	/** gonglishu. */
	private Integer gonglishu;

	/** pingpai. */
	private String pingpai;

	/**
	 * 僐儞僗僩儔僋僞.
	 */
	public Car() {
	}

	/**
	 * name 傪愝掕偟傑偡.
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * name 傪庢摼偟傑偡.
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * yanse 傪愝掕偟傑偡.
	 * 
	 * @param yanse
	 *            yanse
	 */
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}

	/**
	 * yanse 傪庢摼偟傑偡.
	 * 
	 * @return yanse
	 */
	public String getYanse() {
		return this.yanse;
	}

	/**
	 * gonglishu 傪愝掕偟傑偡.
	 * 
	 * @param gonglishu
	 *            gonglishu
	 */
	public void setGonglishu(Integer gonglishu) {
		this.gonglishu = gonglishu;
	}

	/**
	 * gonglishu 傪庢摼偟傑偡.
	 * 
	 * @return gonglishu
	 */
	public Integer getGonglishu() {
		return this.gonglishu;
	}

	/**
	 * pingpai 傪愝掕偟傑偡.
	 * 
	 * @param pingpai
	 *            pingpai
	 */
	public void setPingpai(String pingpai) {
		this.pingpai = pingpai;
	}

	/**
	 * pingpai 傪庢摼偟傑偡.
	 * 
	 * @return pingpai
	 */
	public String getPingpai() {
		return this.pingpai;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}

		return true;
	}

}
