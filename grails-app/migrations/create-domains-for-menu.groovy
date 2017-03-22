databaseChangeLog = {

    changeSet(author: "tim (generated)", id: "1490156936338-1") {
        createTable(tableName: "menu_category") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "menu_categoryPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "category_name", type: "VARCHAR(80)") {
                constraints(nullable: "false")
            }

            column(name: "enabled", type: "BIT") {
                constraints(nullable: "false")
            }

            column(name: "parent", type: "BIGINT")
        }
    }

    changeSet(author: "tim (generated)", id: "1490156936338-2") {
        createTable(tableName: "menu_operation") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "menu_operationPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "category_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "enabled", type: "BIT") {
                constraints(nullable: "false")
            }

            column(name: "operation_name", type: "VARCHAR(80)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tim (generated)", id: "1490156936338-3") {
        addForeignKeyConstraint(baseColumnNames: "category_id", baseTableName: "menu_operation", constraintName: "FK_evjwfxvjchnyfkm9vq6oswp2u", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "menu_category")
    }

}
