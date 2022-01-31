package crc640786c447c26a0a1b;


public class recycleradapter_MyViewHolder
	extends androidx.recyclerview.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("recyclerview.recycleradapter+MyViewHolder, recyclerview", recycleradapter_MyViewHolder.class, __md_methods);
	}


	public recycleradapter_MyViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == recycleradapter_MyViewHolder.class)
			mono.android.TypeManager.Activate ("recyclerview.recycleradapter+MyViewHolder, recyclerview", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
