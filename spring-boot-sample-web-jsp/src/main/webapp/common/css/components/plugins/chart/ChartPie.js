$(function () {
    var chart;
    
    $(document).ready(function () {
    	
    	// Build the chart
        $('#chart-pie').highcharts({
            chart: {
                plotBackgroundColor: null,
                plotBorderWidth: null,
                plotShadow: false
            },

            colors: ["#99ffc7", "#ff99df", "#99edff", "#c999ff", "#99c4ff", "#f4ff99", "#ff9999"],
            title: {
                text: '房源销售比例分析',
                style: {
                         fontWeight: 'bold'
                     }
            },
            tooltip: {
        	    pointFormat: '{series.name}: <b>{point.percentage:.1f}% 20万</b>'
            },
            // legend: {
            //     layout: 'vertical',
            //     align: 'right',
            //     verticalAlign: 'middle',
            //     borderWidth: 0

            // },
            plotOptions: {
                pie: {
                    allowPointSelect: true,
                    cursor: 'pointer',
                    dataLabels: {
                        enabled: false
                    },
                    showInLegend: true
                }
            },
            series: [{
                type: 'pie',
                name: '销售比例',
                data: [
                    ['代售',   25.0],
                    ['销控',   10.0],
                    {
                        name: '认购',
                        y: 30.0,
                        sliced: true,
                        selected: true
                    },
                    ['签约',    20.0],
                    ['交房',     5.0],
                    ['全款到账',   8.0],
                    ['锁定',   2.0]
                ]
            }]
        });
    });
    
});