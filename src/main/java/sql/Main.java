package sql;

import com.github.vertical_blank.sqlformatter.SqlFormatter;

/**
 * @author rd20
 */
public class Main {
    public static void main(String[] args) {
        final String sql = "with \"table_chart_prepare\" as not materialized (\n" +
                "\n" +
                "    select \"status\" as \"prepare_0669369155390301\",\n" +
                "\n" +
                "        \"updater_id\" as \"prepare_0682790159995809\",\n" +
                "\n" +
                "        \"print_count\" as \"prepare_0917999986941657\",\n" +
                "\n" +
                "        \"disc_amount\" as \"prepare_1131613973699355\",\n" +
                "\n" +
                "        \"received_money\" as \"prepare_1313296635033007\",\n" +
                "\n" +
                "        \"amount\" as \"prepare_1356681539933373\",\n" +
                "\n" +
                "        \"approval_status\" as \"prepare_1385373939708805\",\n" +
                "\n" +
                "        \"creator_id\" as \"prepare_1388327335963739\",\n" +
                "\n" +
                "        \"is_deleted\" as \"prepare_3119966931111563\",\n" +
                "\n" +
                "        \"contact_id\" as \"prepare_3196811858348198\",\n" +
                "\n" +
                "        \"qty\" as \"prepare_3346973813164109\",\n" +
                "\n" +
                "        \"approver_id\" as \"prepare_3382126446198811\",\n" +
                "\n" +
                "        \"purchaser_address\" as \"prepare_3393363429336208\",\n" +
                "\n" +
                "        \"seller_id\" as \"prepare_3451235998962234\",\n" +
                "\n" +
                "        \"remark\" as \"prepare_3680563363011418\",\n" +
                "\n" +
                "        \"code\" as \"prepare_4108065063446356\",\n" +
                "\n" +
                "        \"sales_order_id\" as \"prepare_4161328140989863\",\n" +
                "\n" +
                "        \"purchaser_cost\" as \"prepare_4476461116696336\",\n" +
                "\n" +
                "        \"disc_rate\" as \"prepare_5435668996181460\",\n" +
                "\n" +
                "        \"sales_amount\" as \"prepare_5533430012561207\",\n" +
                "\n" +
                "        \"org_id\" as \"prepare_5735728177781723\",\n" +
                "\n" +
                "        \"payment\" as \"prepare_6161386373052300\",\n" +
                "\n" +
                "        \"last_amount\" as \"prepare_6688139880181273\",\n" +
                "\n" +
                "        \"create_time\" as \"prepare_6869361848955790\",\n" +
                "\n" +
                "        \"add_receivable\" as \"prepare_7165068905318855\",\n" +
                "\n" +
                "        \"bill_date\" as \"prepare_8110206803521333\",\n" +
                "\n" +
                "        \"account_id\" as \"prepare_8326833901886130\",\n" +
                "\n" +
                "        \"update_time\" as \"prepare_8908735737542223\",\n" +
                "\n" +
                "        \"partner_id\" as \"prepare_9096013164829589\",\n" +
                "\n" +
                "        \"id\" as \"prepare_9354083310737176\",\n" +
                "\n" +
                "        \"invoiced_amount\" as \"prepare_9484402363231882\",\n" +
                "\n" +
                "        \"approve_time\" as \"prepare_9730382679036262\"\n" +
                "\n" +
                "    from \"s_1\".\"t_225815182839808\" as \"raw\"\n" +
                "\n" +
                "    where (\n" +
                "\n" +
                "            true\n" +
                "\n" +
                "            and true\n" +
                "\n" +
                "            and true\n" +
                "\n" +
                "        )\n" +
                "\n" +
                "),\n" +
                "\n" +
                "\"raw_detail\" as not materialized (\n" +
                "\n" +
                "    select date_trunc('month', \"prepare_8110206803521333\") as \"table_3703095999238613\",\n" +
                "\n" +
                "        date_trunc('day', \"prepare_8110206803521333\") as \"table_2693611288483335\",\n" +
                "\n" +
                "        \"prepare_3346973813164109\" as \"prepare_3346973813164109\"\n" +
                "\n" +
                "    from \"table_chart_prepare\"\n" +
                "\n" +
                "),\n" +
                "\n" +
                "\"filter_result\" as materialized (\n" +
                "\n" +
                "    with \"dim_0\" as (\n" +
                "\n" +
                "        with \"group_by\" as (\n" +
                "\n" +
                "            select avg(\"prepare_3346973813164109\") as \"table_5974249773166112\"\n" +
                "\n" +
                "            from \"raw_detail\"\n" +
                "\n" +
                "        )\n" +
                "\n" +
                "        select \"table_5974249773166112\" as \"table_5974249773166112_0\"\n" +
                "\n" +
                "        from \"group_by\"\n" +
                "\n" +
                "    ),\n" +
                "\n" +
                "    \"dim_1\" as (\n" +
                "\n" +
                "        with \"group_calc\" as (\n" +
                "\n" +
                "            with \"group_by\" as (\n" +
                "\n" +
                "                select \"raw_detail\".\"table_3703095999238613\",\n" +
                "\n" +
                "                    avg(\"prepare_3346973813164109\") as \"table_5974249773166112\"\n" +
                "\n" +
                "                from \"raw_detail\"\n" +
                "\n" +
                "                group by \"raw_detail\".\"table_3703095999238613\"\n" +
                "\n" +
                "            ),\n" +
                "\n" +
                "            \"calc\" as (\n" +
                "\n" +
                "                select case\n" +
                "\n" +
                "                        when \"driver\".\"table_3703095999238613\" is null then ''\n" +
                "\n" +
                "                        else to_char(\"driver\".\"table_3703095999238613\", 'yyyy-mm')\n" +
                "\n" +
                "                    end as \"table_3703095999238613\",\n" +
                "\n" +
                "                    \"driver\".\"table_5974249773166112\" as \"table_5974249773166112\"\n" +
                "\n" +
                "                from \"group_by\" as \"driver\"\n" +
                "\n" +
                "            )\n" +
                "\n" +
                "            select \"calc\".\"table_3703095999238613\",\n" +
                "\n" +
                "                \"table_5974249773166112\"\n" +
                "\n" +
                "            from \"calc\"\n" +
                "\n" +
                "            order by \"calc\".\"table_3703095999238613\" asc\n" +
                "\n" +
                "        ),\n" +
                "\n" +
                "        \"filter\" as (\n" +
                "\n" +
                "            select \"table_3703095999238613\",\n" +
                "\n" +
                "                \"table_5974249773166112\"\n" +
                "\n" +
                "            from \"group_calc\"\n" +
                "\n" +
                "            where \"table_5974249773166112\" > 0\n" +
                "\n" +
                "        )\n" +
                "\n" +
                "        select to_timestamp(\"table_3703095999238613\", 'yyyy-mm') as \"table_3703095999238613\",\n" +
                "\n" +
                "            \"table_5974249773166112\" as \"table_5974249773166112_1\"\n" +
                "\n" +
                "        from \"filter\"\n" +
                "\n" +
                "    ),\n" +
                "\n" +
                "    \"dim_2\" as (\n" +
                "\n" +
                "        with \"group_calc\" as (\n" +
                "\n" +
                "            with \"group_by\" as (\n" +
                "\n" +
                "                select \"raw_detail\".\"table_3703095999238613\",\n" +
                "\n" +
                "                    \"raw_detail\".\"table_2693611288483335\",\n" +
                "\n" +
                "                    avg(\"prepare_3346973813164109\") as \"table_5974249773166112\"\n" +
                "\n" +
                "                from \"raw_detail\"\n" +
                "\n" +
                "                group by \"raw_detail\".\"table_3703095999238613\",\n" +
                "\n" +
                "                    \"raw_detail\".\"table_2693611288483335\"\n" +
                "\n" +
                "            ),\n" +
                "\n" +
                "            \"calc\" as (\n" +
                "\n" +
                "                select case\n" +
                "\n" +
                "                        when \"driver\".\"table_3703095999238613\" is null then ''\n" +
                "\n" +
                "                        else to_char(\"driver\".\"table_3703095999238613\", 'yyyy-mm')\n" +
                "\n" +
                "                    end as \"table_3703095999238613\",\n" +
                "\n" +
                "                    case\n" +
                "\n" +
                "                        when \"driver\".\"table_2693611288483335\" is null then ''\n" +
                "\n" +
                "                        else to_char(\"driver\".\"table_2693611288483335\", 'yyyy-mm-dd')\n" +
                "\n" +
                "                    end as \"table_2693611288483335\",\n" +
                "\n" +
                "                    \"driver\".\"table_5974249773166112\" as \"table_5974249773166112\"\n" +
                "\n" +
                "                from \"group_by\" as \"driver\"\n" +
                "\n" +
                "            )\n" +
                "\n" +
                "            select \"calc\".\"table_3703095999238613\",\n" +
                "\n" +
                "                \"calc\".\"table_2693611288483335\",\n" +
                "\n" +
                "                \"table_5974249773166112\"\n" +
                "\n" +
                "            from \"calc\"\n" +
                "\n" +
                "            order by \"calc\".\"table_3703095999238613\" asc,\n" +
                "\n" +
                "                \"calc\".\"table_2693611288483335\" asc\n" +
                "\n" +
                "        )\n" +
                "\n" +
                "        select to_timestamp(\"table_3703095999238613\", 'yyyy-mm') as \"table_3703095999238613\",\n" +
                "\n" +
                "            to_timestamp(\"table_2693611288483335\", 'yyyy-mm-dd') as \"table_2693611288483335\",\n" +
                "\n" +
                "            \"table_5974249773166112\" as \"table_5974249773166112_2\"\n" +
                "\n" +
                "        from \"group_calc\"\n" +
                "\n" +
                "    )\n" +
                "\n" +
                "    select *\n" +
                "\n" +
                "    from \"dim_2\"\n" +
                "\n" +
                "        join \"dim_1\" using (\"table_3703095999238613\")\n" +
                "\n" +
                "        join \"dim_0\" on true\n" +
                "\n" +
                "),\n" +
                "\n" +
                "\"filtered_detail\" as not materialized (\n" +
                "\n" +
                "    select \"raw_detail\".*\n" +
                "\n" +
                "    from \"raw_detail\"\n" +
                "\n" +
                "    where exists (\n" +
                "\n" +
                "            select *\n" +
                "\n" +
                "            from \"filter_result\"\n" +
                "\n" +
                "                join \"raw_detail\" on (\n" +
                "\n" +
                "                    \"raw_detail\".\"table_3703095999238613\" = date_trunc(\n" +
                "\n" +
                "                        'month',\n" +
                "\n" +
                "                        \"filter_result\".\"table_3703095999238613\"\n" +
                "\n" +
                "                    )\n" +
                "\n" +
                "                    and \"raw_detail\".\"table_2693611288483335\" = date_trunc('day', \"filter_result\".\"table_2693611288483335\")\n" +
                "\n" +
                "                )\n" +
                "\n" +
                "        )\n" +
                "\n" +
                "),\n" +
                "\n" +
                "\"dim_0\" as (\n" +
                "\n" +
                "    with \"group_by\" as (\n" +
                "\n" +
                "        select avg(\"prepare_3346973813164109\") as \"table_5974249773166112\"\n" +
                "\n" +
                "        from \"filtered_detail\"\n" +
                "\n" +
                "    )\n" +
                "\n" +
                "    select \"table_5974249773166112\" as \"table_5974249773166112_0\"\n" +
                "\n" +
                "    from \"group_by\"\n" +
                "\n" +
                "),\n" +
                "\n" +
                "\"dim_1\" as (\n" +
                "\n" +
                "    with \"group_calc\" as (\n" +
                "\n" +
                "        with \"group_by\" as (\n" +
                "\n" +
                "            select \"filtered_detail\".\"table_3703095999238613\",\n" +
                "\n" +
                "                avg(\"prepare_3346973813164109\") as \"table_5974249773166112\"\n" +
                "\n" +
                "            from \"filtered_detail\"\n" +
                "\n" +
                "            group by \"filtered_detail\".\"table_3703095999238613\"\n" +
                "\n" +
                "        ),\n" +
                "\n" +
                "        \"calc\" as (\n" +
                "\n" +
                "            select case\n" +
                "\n" +
                "                    when \"driver\".\"table_3703095999238613\" is null then ''\n" +
                "\n" +
                "                    else to_char(\"driver\".\"table_3703095999238613\", 'yyyy-mm')\n" +
                "\n" +
                "                end as \"table_3703095999238613\",\n" +
                "\n" +
                "                \"driver\".\"table_5974249773166112\" as \"table_5974249773166112\"\n" +
                "\n" +
                "            from \"group_by\" as \"driver\"\n" +
                "\n" +
                "        )\n" +
                "\n" +
                "        select \"calc\".\"table_3703095999238613\",\n" +
                "\n" +
                "            \"table_5974249773166112\"\n" +
                "\n" +
                "        from \"calc\"\n" +
                "\n" +
                "        order by \"calc\".\"table_3703095999238613\" asc\n" +
                "\n" +
                "    )\n" +
                "\n" +
                "    select \"table_3703095999238613\",\n" +
                "\n" +
                "        \"table_5974249773166112\" as \"table_5974249773166112_1\"\n" +
                "\n" +
                "    from \"group_calc\"\n" +
                "\n" +
                "),\n" +
                "\n" +
                "\"dim_2\" as (\n" +
                "\n" +
                "    with \"group_calc\" as (\n" +
                "\n" +
                "        with \"group_by\" as (\n" +
                "\n" +
                "            select \"filtered_detail\".\"table_3703095999238613\",\n" +
                "\n" +
                "                \"filtered_detail\".\"table_2693611288483335\",\n" +
                "\n" +
                "                avg(\"prepare_3346973813164109\") as \"table_5974249773166112\"\n" +
                "\n" +
                "            from \"filtered_detail\"\n" +
                "\n" +
                "            group by \"filtered_detail\".\"table_3703095999238613\",\n" +
                "\n" +
                "                \"filtered_detail\".\"table_2693611288483335\"\n" +
                "\n" +
                "        ),\n" +
                "\n" +
                "        \"calc\" as (\n" +
                "\n" +
                "            select case\n" +
                "\n" +
                "                    when \"driver\".\"table_3703095999238613\" is null then ''\n" +
                "\n" +
                "                    else to_char(\"driver\".\"table_3703095999238613\", 'yyyy-mm')\n" +
                "\n" +
                "                end as \"table_3703095999238613\",\n" +
                "\n" +
                "                case\n" +
                "\n" +
                "                    when \"driver\".\"table_2693611288483335\" is null then ''\n" +
                "\n" +
                "                    else to_char(\"driver\".\"table_2693611288483335\", 'yyyy-mm-dd')\n" +
                "\n" +
                "                end as \"table_2693611288483335\",\n" +
                "\n" +
                "                \"driver\".\"table_5974249773166112\" as \"table_5974249773166112\"\n" +
                "\n" +
                "            from \"group_by\" as \"driver\"\n" +
                "\n" +
                "        )\n" +
                "\n" +
                "        select \"calc\".\"table_3703095999238613\",\n" +
                "\n" +
                "            \"calc\".\"table_2693611288483335\",\n" +
                "\n" +
                "            \"table_5974249773166112\"\n" +
                "\n" +
                "        from \"calc\"\n" +
                "\n" +
                "        order by \"calc\".\"table_3703095999238613\" asc,\n" +
                "\n" +
                "            \"calc\".\"table_2693611288483335\" asc\n" +
                "\n" +
                "    )\n" +
                "\n" +
                "    select \"table_3703095999238613\",\n" +
                "\n" +
                "        \"table_2693611288483335\",\n" +
                "\n" +
                "        \"table_5974249773166112\" as \"table_5974249773166112_2\"\n" +
                "\n" +
                "    from \"group_calc\"\n" +
                "\n" +
                ")\n" +
                "\n" +
                "select *\n" +
                "\n" +
                "from \"dim_2\"\n" +
                "\n" +
                "    join \"dim_1\" using (\"table_3703095999238613\")\n" +
                "\n" +
                "    join \"dim_0\" on true\n";
//        System.out.println(new BasicFormatterImpl().format(sql));

        System.out.println(SqlFormatter.format(sql));
    }
}
