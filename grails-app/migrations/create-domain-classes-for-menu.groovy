databaseChangeLog = {

    changeSet(author: "tim (generated)", id: "1478296526454-1") {
        createTable(tableName: "clasification_menu") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "clasification_menuPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "parent_id", type: "BIGINT")
        }
    }

    changeSet(author: "tim (generated)", id: "1478296526454-2") {
        createTable(tableName: "menu") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "menuPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "enabled", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "parent_id", type: "BIGINT")
        }
    }

    changeSet(author: "tim (generated)", id: "1478296526454-3") {
        createTable(tableName: "operation") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "operationPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "action", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "controller", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "enabled", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "menu_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(80)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tim (generated)", id: "1478296526454-4") {
        addForeignKeyConstraint(baseColumnNames: "parent_id", baseTableName: "clasification_menu", constraintName: "FK_85ap2cxwg1iuaiuhd1ppf9qv6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "menu")
    }

    changeSet(author: "tim (generated)", id: "1478296526454-5") {
        addForeignKeyConstraint(baseColumnNames: "parent_id", baseTableName: "menu", constraintName: "FK_98a0njtu1xt51ul6g3v0ptj8b", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "clasification_menu")
    }

    changeSet(author: "tim (generated)", id: "1478296526454-6") {
        addForeignKeyConstraint(baseColumnNames: "menu_id", baseTableName: "operation", constraintName: "FK_aakgqoj7953bheg62whb11kde", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "menu")
    }
}
