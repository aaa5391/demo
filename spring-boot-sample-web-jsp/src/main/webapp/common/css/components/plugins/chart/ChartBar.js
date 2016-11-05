var randomScalingFactor = function(){ return Math.round(Math.random()*30)};

	var barChartData1 = {
		labels : ["陈小国","李明","王小小","邢大达"],
		datasets : [
			{
				fillColor : "#4194cf",
				// strokeColor : "rgba(220,220,220,0.8)",
				// highlightFill: "rgba(220,220,220,0.75)",
				// highlightStroke: "rgba(220,220,220,1)",
				data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
			},
			{
				fillColor : "#609550",
				// strokeColor : "rgba(151,187,205,0.8)",
				// highlightFill : "rgba(151,187,205,0.75)",
				// highlightStroke : "rgba(151,187,205,1)",
				data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
			}
		]

	}

	var barChartData2 = {
		labels : ["陈小国","李明","王小小","邢大达"],
		datasets : [
			{
				fillColor : "#4194cf",
				// strokeColor : "rgba(220,220,220,0.8)",
				// highlightFill: "rgba(220,220,220,0.75)",
				// highlightStroke: "rgba(220,220,220,1)",
				data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
			}
		]

	}	

	var barChartData3 = {
		labels : ["陈小国","李明","王小小","邢大达"],
		datasets : [
			{
				fillColor : "#4194cf",
				// strokeColor : "rgba(220,220,220,0.8)",
				// highlightFill: "rgba(220,220,220,0.75)",
				// highlightStroke: "rgba(220,220,220,1)",
				data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
			},
			{
				fillColor : "#609550",
				// strokeColor : "rgba(151,187,205,0.8)",
				// highlightFill : "rgba(151,187,205,0.75)",
				// highlightStroke : "rgba(151,187,205,1)",
				data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
			}
		]

	}
	window.onload = function(){
		var ctx1 = document.getElementById("chart-bar-1").getContext("2d");
		var ctx2 =document.getElementById("chart-bar-2").getContext("2d");
		var ctx3 =document.getElementById("chart-bar-3").getContext("2d");		
		// var ctx4 = document.getElementById("chart-bar-4").getContext("2d");
		// var ctx5 = document.getElementById("chart-line").getContext("2d");

		window.myBar1 = new Chart(ctx1).Bar(barChartData1, {
			responsive : true
		});
		window.myBar2 = new Chart(ctx2).Bar(barChartData2, {
			responsive : true
		});
		window.myBar3 = new Chart(ctx3).Bar(barChartData3, {
			responsive : true
		});
	}






















 // $(document).ready(function () {
 //            // prepare chart data
 //            var sampleData = [
 //                    { Day: '陈小明', Keith: 30, Erica: 15 },
 //                    { Day: '李明', Keith: 25, Erica: 25},
 //                    { Day: '王小小', Keith: 30, Erica: 20},
 //                    { Day: '邢太太', Keith: 35, Erica: 25}            
 //                ];

 //            // prepare jqxChart settings
 //            var settings = {
 //                // title: "Fitness & exercise weekly scorecard",
 //                // description: "Time spent in vigorous exercise",
 //                // padding: { left: 5, top: 5, right: 5, bottom: 5 },
 //                // titlePadding: { left: 90, top: 0, right: 0, bottom: 10 },
 //                source: sampleData,
 //                xAxis:
 //                    {
 //                        dataField: 'Day',
 //                        showGridLines: false,
 //                        type: 'basic'
 //                    },
 //                // colorScheme: 'scheme04',
 //                showToolTips: false,
 //                enableAnimations: true,
 //                seriesGroups:
 //                    [
 //                        {
 //                            type: 'column',
 //                            valueAxis:
 //                            {
 //                                minValue: 0,
 //                                maxValue: 30,
 //                                unitInterval: 10,
 //                                // description: 'Time in minutes'
 //                            },
 //                            // mouseover: myEventHandler,
 //                            // mouseout: myEventHandler,
 //                            // click: myEventHandler,

 //                            series: [
 //                                    { dataField: 'Keith', displayText: '认购' },
 //                                    { dataField: 'Erica', displayText: '签约' }                                    
 //                                ]
 //                        }
 //                    ]
 //            };

 //            function myEventHandler(e) {
 //                var eventData = '<div><b>Last Event: </b>' + e.event + '<b>, DataField: </b>' + e.serie.dataField + '<b>, Value: </b>' + e.elementValue + "</div>";
 //                $('#eventText').html(eventData);
 //            };

 //            // select the chartContainer DIV element and render the chart.
 //            $('#chartContainer').jqxChart(settings);
 //        });
