## 小组成员

组长：康南，学号：171250554

组员：曾思鸿，学号：171250523

组员：赖宝光，学号：171250524

组员：沈健，学号：171250566

## 流水线部署

http://49.234.229.20:8080/

用户名：root

密码：Kn2567503

## 项目部署地址

http://47.103.192.117/home   

## 接口说明

请求方法：get
请求路径：/admin/refresh
返回结果：
success


请求方法：get
请求路径：/admin/getConfusedAlias?page=xx&type=xx
返回结果：
{
    List<AliasVO>    
}


请求方法：post
请求路径：/admin/modifyAlias
提交数据：
{
    sonId,
    fatherId,
    type,
}
返回结果：
{
    success,
}


请求方法：post
请求路径：/admin/getEffectiveAlias
提交数据：
{
    page,
    type,
}
返回结果：
{
    List<AliasVO>,
}


请求方法：post
请求路径：/admin/cancelAlias
提交数据：
{
    sonId,
    type,
}
返回结果：
{
    success,
}


请求方法：get
请求路径：/search/{text}/{mode}?pageNumber=xx&sortMode=xx&perPage=xx
返回结果：
{
    List<SimplePaperVO>
}


请求方法：get
请求路径：/paperDetail/{id}
返回结果：
{
    PaperVO
}


请求方法：get
请求路径：/searchable
返回结果：
{
    success
}


请求方法：get
请求路径：/peerReview/complete/{prefix}
返回结果：
{
    List<String>
}


请求方法：post
请求路径：/peerReview/recommend
提交数据：
{
    InformationReviewed
}
返回结果：
{
    List<Author>
}


请求方法：get
请求路径：/rank/{mode}?pageNumber=xx&descend=xx&startYear=xx&endYear=xx
返回结果：
{
    RankVO
}


请求方法：get
请求路径：/hot?type=xx
返回结果：
{
    List<PopRankItem>
}


