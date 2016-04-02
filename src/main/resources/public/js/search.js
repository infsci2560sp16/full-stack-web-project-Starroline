
function search(){
  var movie=$("#search-box").val();
    $.get("/search",{"movie":movie},function(data){
    alert(data);
    //var data_xml = jQuery.parseXML(data);
    //alert(data_xml.documentElement.nodeName);
  });

}



