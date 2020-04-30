/*
 *
 * Copyright 2019 Luca Molino (luca.molino--AT--assetdata.it)
 *
 */
package hello.world.domain;

/**
 * @author luca.molino
 *
 */
public enum AccountRole {

	ADMIN {
		@Override
		public String getSpringRole() {
			return "ROLE_ADMIN";
		}
	},
	USER {
		@Override
		public String getSpringRole() {
			return "ROLE_USER";
		}
	},
	IT_HRPRO {
		@Override
		public String getSpringRole() {
			return "ROLE_IT_HRPRO";
		}
	};

	public abstract String getSpringRole();
}
